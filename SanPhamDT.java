package phanhuuminh_54;
import java.time.LocalDate;

public class SanPhamDT extends SanPham{
	private int ThoiGianBH;

	public int getThoiGianBH() {
		return ThoiGianBH;
	}

	public void setThoiGianBH(int thoiGianBH) {
		ThoiGianBH = thoiGianBH;
	}
    /**
     * 
     * @param maSP
     * @param tenSP
     * @param ngaySP
     * @param giaNhap
     * @param sLTonKho
     * @param thoiGianBH
     */
	public SanPhamDT(String maSP, String tenSP, LocalDate ngaySP, Double giaNhap, Double sLTonKho, int thoiGianBH) {
		super(maSP, tenSP, ngaySP, giaNhap, sLTonKho);
		ThoiGianBH = thoiGianBH;
	}
    public double GiaBan() {
		return GiaNhap + (GiaNhap * 0.1) + (ThoiGianBH * 50000);
    	
    }

	@Override
	public String toString() {
		return "SanPhamDT [ThoiGianBH=" + ThoiGianBH + ", MaSP=" + MaSP + ", TenSP=" + TenSP + ", GiaNhap=" + GiaNhap
				+ ", SLTonKho=" + SLTonKho + ", getThoiGianBH()=" + getThoiGianBH() + ", GiaBan()=" + GiaBan()
				+ ", getMaSP()=" + getMaSP() + ", getTenSP()=" + getTenSP() + ", getNgaySP()=" + getNgaySP()
				+ ", getGiaNhap()=" + getGiaNhap() + ", getSLTonKho()=" + getSLTonKho() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + "]";
	}
    
	
	

}
