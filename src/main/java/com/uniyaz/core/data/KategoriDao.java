package com.uniyaz.core.data;


import com.uniyaz.core.domain.Kategori;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class KategoriDao {
    Connection connection = null;
    PreparedStatement ps = null;
    ResultSet rs = null;


    public void addKategori(String kategoriAdi) {
        try {
            connection = DataBaseConnection.getConnection();
            String sql = "INSERT INTO testuniversal.kategori (ad) VALUES (?)";
            ps = connection.prepareStatement(sql);
            ps.setString(1, kategoriAdi);
            ps.executeUpdate();
            connection.close();
        } catch (SQLException hata) {
            throw new RuntimeException(hata);
        } catch (ClassNotFoundException hata) {
            throw new RuntimeException(hata);
        }
        finally {

        }
    }


    public void deleteKategori(Kategori kategori) {
        try {
            connection = DataBaseConnection.getConnection();
            Statement stmt = connection.createStatement();
            String sql = "DELETE FROM testuniversal.kategori WHERE id = " + kategori.getId() + ";";
            stmt.executeUpdate(sql);
            connection.close();
        } catch (SQLException | ClassNotFoundException | NullPointerException hata) {
            throw new RuntimeException(hata);
        }
        finally {

        }
    }


    public List<Kategori> findKategoriByKategoriId(int kategoriId) {
        List<Kategori> kategoriList = new ArrayList<Kategori>();

        try {

            connection = DataBaseConnection.getConnection();

            String hql = "Select * From testuniversal.kategori ";

            Statement stmt = connection.createStatement();
            rs = stmt.executeQuery(hql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                kategoriList.add(new Kategori(id, ad));
            }
            connection.close();
        } catch (SQLException hata) {
            throw new RuntimeException(hata);
        } catch (ClassNotFoundException hata) {
            throw new RuntimeException(hata);
        }
        finally {

        }
        return kategoriList;
    }

    public List<Kategori> findAll() {
        List<Kategori> kategoriList = new ArrayList<Kategori>();

        try {

            connection = DataBaseConnection.getConnection();

            String hql = "Select * From testuniversal.kategori ";

            Statement stmt = connection.createStatement();
            rs = stmt.executeQuery(hql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                kategoriList.add(new Kategori(id, ad));
            }
            connection.close();
        } catch (SQLException hata) {
            throw new RuntimeException(hata);
        } catch (ClassNotFoundException hata) {
            throw new RuntimeException(hata);
        }
        finally {

        }

        return kategoriList;
    }
}
