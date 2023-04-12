/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ultilities;

import DomainModels.ChatLieu;
import DomainModels.ChiTietSP;
import DomainModels.DeGiay;
import DomainModels.KhachHang;
import DomainModels.Mau;
import DomainModels.SanPham;
import DomainModels.Size;
import DomainModels.ThuongHieu;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author trxua
 */
public class HibernateUtil {

    private static SessionFactory FACTORY;

    static {
        Configuration conf = new Configuration();

        Properties properties = new Properties();
        properties.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
        properties.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        properties.put(Environment.URL, "jdbc:sqlserver://localhost:1433;databaseName=POS_BMS");
        properties.put(Environment.USER, "sa");
        properties.put(Environment.PASS, "123");
        properties.put(Environment.SHOW_SQL, "true");

        conf.setProperties(properties);
        conf.addAnnotatedClass(KhachHang.class);
        conf.addAnnotatedClass(ChatLieu.class);
        conf.addAnnotatedClass(ChiTietSP.class);
        conf.addAnnotatedClass(DeGiay.class);
        conf.addAnnotatedClass(Mau.class);
        conf.addAnnotatedClass(SanPham.class);
        conf.addAnnotatedClass(Size.class);
        conf.addAnnotatedClass(ThuongHieu.class);

        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(registry);

    }

    public static SessionFactory getFACTORY() {
        return FACTORY;
    }

    public static void main(String[] args) {
        System.out.println(getFACTORY());
    }
}
