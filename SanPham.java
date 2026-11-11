package phanhuuminh_54;
import java.time.LocalDate;
import java.util.Objects;

public abstract class SanPham {
	protected String MaSP;
	protected String TenSP;
	protected LocalDate NgaySX;
	protected Double GiaNhap;
	protected Double SLTonKho;
	

	public SanPham(String maSP, String tenSP, LocalDate ngaySP, Double giaNhap, Double sLTonKho) {
		this.MaSP = maSP;
		this.TenSP = tenSP;
		this.NgaySX = ngaySP;
		this.GiaNhap = giaNhap;
		this.SLTonKho= sLTonKho;
	}

	public String getMaSP() {
		return MaSP;
	}

	public void setMaSP(String maSP) {
		MaSP = maSP;
	}

	public String getTenSP() {
		return TenSP;
	}

	public void setTenSP(String tenSP) {
		TenSP = tenSP;
	}

	public LocalDate getNgaySP() {
		return NgaySX;
	}

	public void setNgaySL(LocalDate ngaySP) {
		NgaySX = ngaySP;
	}

	public Double getGiaNhap() {
		return GiaNhap;
	}

	public void setGiaNhap(Double giaNhap) {
		GiaNhap = giaNhap;
	}

	public Double getSLTonKho() {
		return SLTonKho;
	}

	public void setSLTonKho(Double sLTonKho) {
		SLTonKho = sLTonKho;
	}
	
    public abstract double GiaBan();
	


	@Override
	public int hashCode() {
		return Objects.hash(GiaNhap, MaSP, NgaySX, SLTonKho, TenSP);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SanPham other = (SanPham) obj;
		return Objects.equals(GiaNhap, other.GiaNhap) && Objects.equals(MaSP, other.MaSP)
				&& Objects.equals(NgaySX, other.NgaySX) && Objects.equals(SLTonKho, other.SLTonKho)
				&& Objects.equals(TenSP, other.TenSP);
	}

	@Override
	public String toString() {
		return String.format("SanPham [MaSP=" + MaSP + ", TenSP=" + TenSP + ", NgaySP=" + NgaySX + ", GiaNhap="+"VND" + GiaNhap
				+ ", SLTonKho=" + SLTonKho + "]");
	}
	
	
}
