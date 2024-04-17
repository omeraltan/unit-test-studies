package com.test.mockito.data.api;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class MusteriServiceTest {

    private MusteriService musteriService;
    private MusteriRepository musteriRepository = new MusteriRepositoryStub();
    private BilgilendirmeService bilgilendirmeService;

    @Before
    public void setUp() throws Exception {
        musteriService = new MusteriService();
        musteriRepository = Mockito.mock(MusteriRepository.class);
        bilgilendirmeService = Mockito.mock(BilgilendirmeService.class);
        musteriService.setMusteriRepository(musteriRepository);
        musteriService.setBilgilendirmeService(bilgilendirmeService);
    }

//    @Test
//    public void testMusteriKaydet() {
//        Musteri musteri = new Musteri(1234);
//        musteriService.musteriKaydet(musteri);
//        //kontrol etmemiz gerekiyor?
//        //Mockito.verify(musteriRepository).kaydet(musteri);
//        assertEquals(musteri, musteriRepository.bul(musteri.getId()));
//        Mockito.verify(bilgilendirmeService).yeniKayitMailGonder(musteri);
//    }

//    @Test
//    public void testMusteriSil() throws Exception {
//        assertNotNull(musteriRepository.bul(1234));
//        musteriService.musteriSil(1234);
//        assertNull(musteriRepository.bul(1234));
//    }

}
