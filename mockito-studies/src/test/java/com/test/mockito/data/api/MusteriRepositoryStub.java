package com.test.mockito.data.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MusteriRepositoryStub extends MusteriRepository{

    private Map<Integer, Musteri> musteriList = new HashMap<>();

    @Override
    public void kaydet(Musteri musteri) {
        musteriList.put(musteri.getId(), musteri);
    }

    @Override
    public void sil(Integer musteriId) {
        musteriList.remove(musteriId);
    }

    @Override
    public Musteri bul(Integer musteriId) {
        return musteriList.get(musteriId);
    }


}
