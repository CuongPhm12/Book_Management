package test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.ChiTietDonHang;
import model.CuocHop;
import model.Customer;
import model.DonHang;
import model.GiaoVien;
import model.My_Order;
import model.NhanVien;
import model.SinhVien;
import util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();

//			DonHang dh1 = new DonHang();
//			dh1.setTenKhachHang("Pham Viet Cuong");
//			dh1.setNgayMua(new Date(123, 12, 12));
////			
//			for (int i = 0; i < 10000; i++) {
//				ChiTietDonHang ctdh1 = new ChiTietDonHang();
//				ctdh1.setTenSanPham(i + "");
//				ctdh1.setGiaBan(1200000);
//				ctdh1.setSoLuong(2);
//				ctdh1.setThanhTien(1200000 * 2);
//				ctdh1.setDonHang(dh1);
//				dh1.addCTDH(ctdh1);
//			}
//			session.save(dh1);
//			long batDau = System.currentTimeMillis();
//			DonHang dh1 = session.load(DonHang.class, 1);
//			System.out.println(dh1.toString());
//			long ketThuc = System.currentTimeMillis();
//			System.out.println("Thời gian thực hiện câu lệnh là: " + (ketThuc - batDau));
//			session.remove(dh1);

			tr.commit();
			session.close();
		}
	}
}
