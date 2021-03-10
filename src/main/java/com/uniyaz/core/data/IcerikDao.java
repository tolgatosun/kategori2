package com.uniyaz.core.data;


import com.uniyaz.core.domain.Icerik;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class IcerikDao {
    Connection connection = null;
    PreparedStatement ps = null;
    ResultSet rs = null;


    public void addIcerik(Icerik icerik) {
        try {
            connection = DataBaseConnection.getConnection();
            String sql = "INSERT INTO testuniversal.icerik (kategori_id,baslik,aciklama,foto) VALUES (?,?,?,?)";
            ps = connection.prepareStatement(sql);
            ps.setInt(1, icerik.kategori_id);
            ps.setString(2, icerik.baslik);
            ps.setString(3, icerik.aciklama);
            ps.setString(4, icerik.foto);
            ps.executeUpdate();
            connection.close();
        } catch (SQLException hata) {
            throw new RuntimeException(hata);
        } catch (ClassNotFoundException hata) {
            throw new RuntimeException(hata);
        } finally {

        }
    }


    public void deleteIcerik(Icerik icerik) {
        try {
            connection = DataBaseConnection.getConnection();
            Statement stmt = connection.createStatement();
            String sql = "DELETE FROM testuniversal.icerik WHERE id = " + icerik.getId() + ";";
            stmt.executeUpdate(sql);
            connection.close();
        } catch (SQLException | ClassNotFoundException | NullPointerException hata) {
            throw new RuntimeException(hata);
        } finally {

        }
    }


    public List<Icerik> findAll() {
        List<Icerik> icerikList = new ArrayList<Icerik>();

        try {

            connection = DataBaseConnection.getConnection();

            String hql = "Select * From testuniversal.icerik ";

            Statement stmt = connection.createStatement();
            rs = stmt.executeQuery(hql);

            while (rs.next()) {
                int id = rs.getInt("id");
                int kategori_id = rs.getInt("kategori_id");
                String baslik = rs.getString("baslik");
                String aciklama = rs.getString("aciklama");
                String foto = rs.getString("foto");
                icerikList.add(new Icerik(id, kategori_id, baslik, aciklama, foto));
            }
            connection.close();
        } catch (SQLException hata) {
            throw new RuntimeException(hata);
        } catch (ClassNotFoundException hata) {
            throw new RuntimeException(hata);
        }
        return icerikList;
    }

    public List<Icerik> findIcerikBIcerikId(int icerikId) {
        List<Icerik> icerikList = new ArrayList<Icerik>();

        try {
            connection = DataBaseConnection.getConnection();
            String hql = "Select * From testuniversal.icerik where id =" + icerikId;
            Statement stmt = connection.createStatement();
            //ps.setInt(1, icerikId);
            rs = stmt.executeQuery(hql);

            while (rs.next()) {
                int id = rs.getInt("id");
                int kategori_id = rs.getInt("kategori_id");
                String baslik = rs.getString("baslik");
                String aciklama = rs.getString("aciklama");
                String foto = rs.getString("foto");
                icerikList.add(new Icerik(id, kategori_id, baslik, aciklama, foto));
            }
            connection.close();
        } catch (SQLException hata) {
            throw new RuntimeException(hata);
        } catch (ClassNotFoundException hata) {
            throw new RuntimeException(hata);
        }
        return icerikList;
    }

    public List<Icerik> findIcerikByKategoriId(int kategoriId) {
        List<Icerik> icerikList = new ArrayList<Icerik>();

        try {
            connection = DataBaseConnection.getConnection();
            String hql = "Select * From testuniversal.icerik where kategori_id =" + kategoriId;
            Statement stmt = connection.createStatement();
//            ps.setInt(1, kategoriId);
            rs = stmt.executeQuery(hql);

            while (rs.next()) {
                int id = rs.getInt("id");
                int kategori_id = rs.getInt("kategori_id");
                String baslik = rs.getString("baslik");
                String aciklama = rs.getString("aciklama");
                String foto = rs.getString("foto");
                icerikList.add(new Icerik(id, kategori_id, baslik, aciklama, foto));
            }
            connection.close();
        } catch (SQLException hata) {
            throw new RuntimeException(hata);
        } catch (ClassNotFoundException hata) {
            throw new RuntimeException(hata);
        }
        return icerikList;
    }


}
