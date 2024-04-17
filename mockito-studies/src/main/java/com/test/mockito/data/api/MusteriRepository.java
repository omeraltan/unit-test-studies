package com.test.mockito.data.api;

public class MusteriRepository {

    public void kaydet(Musteri musteri){
        System.out.println("kaydedildi");
    }

    public void sil(Integer musteriId){
        System.out.println("musteri silindi");
    }

    public Musteri bul(Integer musteriId){
        System.out.println("Oracle DB bul");
        return null;
    }

}
