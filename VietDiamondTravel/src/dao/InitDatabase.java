package dao;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class InitDatabase {

    public static void init() {
        String createTour = "CREATE TABLE IF NOT EXISTS Tour ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "ten TEXT NOT NULL,"
                + "diemKhoiHanh TEXT,"
                + "diemDen TEXT,"
                + "ngayKhoiHanh TEXT,"
                + "gia REAL,"
                + "soLuong INTEGER"
                + ");";

        String createKhachHang = "CREATE TABLE IF NOT EXISTS KhachHang ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "hoTen TEXT,"
                + "soDienThoai TEXT,"
                + "email TEXT,"
                + "diaChi TEXT"
                + ");";

        String createDatTour = "CREATE TABLE IF NOT EXISTS DatTour ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "idKhachHang INTEGER,"
                + "idTour INTEGER,"
                + "ngayDat TEXT,"
                + "soLuong INTEGER,"
                + "tongTien REAL,"
                + "FOREIGN KEY (idKhachHang) REFERENCES KhachHang(id),"
                + "FOREIGN KEY (idTour) REFERENCES Tour(id)"
                + ");";

        try (Connection conn = Database.getConnection(); Statement stmt = conn.createStatement()) {
            stmt.execute(createTour);
            stmt.execute(createKhachHang);
            stmt.execute(createDatTour);
            System.out.println("✅ Database & tables đã tạo xong.");
        } catch (SQLException e) {
            System.out.println("❌ Lỗi khi tạo database: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        init();
    }
}
