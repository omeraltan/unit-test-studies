package com.test.mockito.data.api;

public class MusteriService {

    private MusteriRepository musteriRepository;

    private BilgilendirmeService bilgilendirmeService;

    public void musteriKaydet(Musteri musteri){
        musteriRepository.kaydet(musteri);
        bilgilendirmeService.yeniKayitMailGonder(musteri);
    }

    public void musteriSil(Integer musteriId){
        musteriRepository.sil(musteriId);
    }

    public void setMusteriRepository(MusteriRepository musteriRepository) {
        this.musteriRepository = musteriRepository;
    }

    public void setBilgilendirmeService(BilgilendirmeService bilgilendirmeService) {
        this.bilgilendirmeService = bilgilendirmeService;
    }
}
