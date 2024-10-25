Feature: EnUygun Web Sitesinden Basarili Ucus Rotasi Olusturma Islemi
  @Filtreleme
  Scenario: Parametrik Ucus rotasi aratilip goruntulenmesi saglanir
    Given EnUygun.com Web sitesine gidilir
    When Kullanici Gidis donus secenegini secer
    And Kullanici kalkis sehri secenegini secer
    And Kullanici varis sehri secenegini secer
    And Kullanici gidis tarihini secer
    And Kullanici donus tarihini secer
    And Kullanici yolcu sayisini secer
    And Kullanici ucus sinifini secer
    And Kullanici secimi onaylar
    Then Tercih edilen alanlar aratilir
    When Sayfanin acildigi kontrol edilir
    And Kullanici gidis kalkis varis saatleri fitresine tiklar
    And Kullanici filtreleme alanlarindan istenilen saat araligi secer
    Then Filtrele alnlarina gore goruntulendigi dogrulanir
