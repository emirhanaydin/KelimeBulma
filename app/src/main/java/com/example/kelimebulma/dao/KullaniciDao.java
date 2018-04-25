package com.example.kelimebulma.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.kelimebulma.model.Kullanici;

@Dao
public interface KullaniciDao {
    @Query("SELECT ad FROM kullanici WHERE id = :id")
    String getAd(int id);

    @Query("UPDATE kullanici SET ad = :ad WHERE id = :id")
    void setAd(int id, String ad);

    @Query("SELECT soyad FROM kullanici WHERE id = :id")
    String getSoyad(int id);

    @Query("UPDATE kullanici SET soyad = :soyad WHERE id = :id")
    void setSoyad(int id, String soyad);

    @Query("SELECT kullanici_adi FROM kullanici WHERE id = :id")
    String getKullaniciAdi(int id);

    @Query("UPDATE kullanici SET kullanici_adi = :kullaniciAdi WHERE id = :id")
    void setKullaniciAdi(int id, String kullaniciAdi);

    @Query("SELECT eposta FROM kullanici WHERE id = :id")
    String getEposta(int id);

    @Query("UPDATE kullanici SET eposta = :eposta WHERE id = :id")
    void setEposta(int id, String eposta);

    @Query("SELECT sifre FROM kullanici WHERE id = :id")
    String getSifre(int id);

    @Query("UPDATE kullanici SET sifre = :sifre WHERE id = :id")
    void setSifre(int id, String sifre);

    @Query("SELECT * FROM kullanici WHERE id = :id")
    Kullanici getKullanici(int id);

    @Query("SELECT * FROM kullanici WHERE kullanici_adi = :kullaniciAdi")
    Kullanici getKullanici(String kullaniciAdi);

    @Insert
    void ekle(Kullanici... kisiler);

    @Delete
    void sil(Kullanici kullanici);
}
