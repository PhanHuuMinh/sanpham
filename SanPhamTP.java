package phanhuuminh_54;
import java.time.LocalDate;
public class SanPhamTP extends SanPham{
	public LocalDate NgayHetHan;

	public LocalDate getNgayHetHan() {
		return NgayHetHan;
	}

	public void setNgayHetHan(LocalDate ngayHetHan) {
		NgayHetHan = ngayHetHan;
	}

	public SanPhamTP(String maSP, String tenSP, LocalDate ngaySP, Double giaNhap, Double sLTonKho, LocalDate ngayHetHan) {
		super(maSP, tenSP, ngaySP, giaNhap, sLTonKho);
		NgayHetHan = ngayHetHan;
	}

	@Override
	public double GiaBan() {
		if (LocalDate.now().isAfter(NgayHetHan)) {
			return 0;
			
		}
		return GiaNhap + (GiaNhap * 0.05);
		
	}

	@Override
	public String toString() {
		return "SanPhamTP [NgayHetHan=" + NgayHetHan + ", MaSP=" + MaSP + ", TenSP=" + TenSP + ", GiaNhap=" + GiaNhap
				+ ", SLTonKho=" + SLTonKho + ", getNgayHetHan()=" + getNgayHetHan() + ", GiaBan()=" + GiaBan()
				+ ", getMaSP()=" + getMaSP() + ", getTenSP()=" + getTenSP() + ", getNgaySP()=" + getNgaySP()
				+ ", getGiaNhap()=" + getGiaNhap() + ", getSLTonKho()=" + getSLTonKho() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + "]";
	}

}
