package phanhuuminh_54;

import java.util.ArrayList;
import java.util.List;




public class QuanLySanPham {
	List<SanPham>danhSachSP;
	
	public QuanLySanPham() {
		this.danhSachSP = new ArrayList<SanPham>();
	}

	
	public boolean themSanPham(SanPham sp) {
		if (danhSachSP.contains(sp))
			danhSachSP.add(sp);
		
		
		return false;
	}
	public SanPham timKiem(String maPhong) {
		for(SanPham sp : danhSachSP) {
			if(sp.getMaSP().equalsIgnoreCase(maPhong.trim())) {
				return sp;
			}
		}
		return null;
	}


	public boolean xoaSanPham(String maSP) {
		SanPham sp = timKiem(maSP);
		if (sp != null) {
			return danhSachSP.remove(sp);
			
		}
		return false;
	}

}
	

	
	

	
	

	
	

