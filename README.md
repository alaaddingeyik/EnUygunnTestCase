
# **EnUygun.com Uçak Bileti Test Otomasyon Projesi**

Bu proje, **EnUygun.com** üzerindeki uçak bileti arama ve filtreleme işlemlerinin otomasyonunu sağlar.
 Proje, kullanıcıların uçuş araması yapmasına, kalkış ve varış saatlerine göre filtreleme yapmasına ve sonuçların fiyatlarına göre sıralanmasını doğrulayan test senaryoları içerir.
 Testler **Java**, **Selenium**, **Cucumber** ve **Maven** ile gerçekleştirilmiştir.

## **Proje Yapısı**

```
📦src
 ┣ 📂test
 ┃ ┣ 📂java
 ┃ ┃ ┣ 📂pages                     # Web sayfası nesnelerini ve elementlerini içeren sınıflar
 ┃ ┃ ┣ 📂step_definitions          # Cucumber step definition'larını içeren sınıflar
 ┃ ┃ ┣ 📂runners                   # Test çalıştırıcı sınıflar
 ┃ ┣ 📂resources                   # Konfigürasyon dosyaları (örneğin, config.properties)
 📄README.txt
 📄pom.xml
```

## **Özellikler**
- **Cucumber BDD**: Proje, Behavior-Driven Development (BDD) yaklaşımıyla test senaryolarını oluşturur.
- **Selenium**: Web sürücü kullanarak EnUygun.com üzerinde tarayıcı bazlı testleri otomatikleştirir.
- **Modüler Yapı**: Ortak işlemler için Base sınıfları ve modüler page-object yapısı kullanır.
- **Konfigüre Edilebilirlik**: `config.properties` dosyası, ortam değişkenlerini (örneğin, base URL, kullanıcı bilgileri) içerir.
- **Extent Reports Entegrasyonu**: Test sonuçlarının raporlanmasını sağlar (alternatif olarak Maven Surefire raporları kullanılabilir.

## **Gereksinimler**
- **Java 11** veya üstü
- **Maven**: Proje, Maven ile yönetilir.
- **Selenium WebDriver**: Tarayıcı tabanlı testleri çalıştırmak için kullanılır.
- **Cucumber**: BDD tabanlı test senaryolarını oluşturmak için kullanılır.

### **Test Senaryoları**

   Bu testler, geçerli girişlerle birlikte uygulamanın beklenen sonuçları döndürdüğünden emin olmak için oluşturulmuştur.

   - **Uçuş Arama Testi**: İstanbul ve Ankara arasında gidiş-dönüş uçuş aranması ve saat filtresi uygulanması.
   - **Fiyat Sıralama Testi**: Uçuşların fiyatlarına göre artan sıralamada listelendiğinin doğrulanması.
   - **Filtreleme Testi**: Kalkış ve varış saatlerine göre uçuşların filtrelenmesi ve sonuçların doğru gösterildiğinin doğrulanması.
   - **Impacti yuksek gordugum alanlarin basinda login olma islemi oldugu icin kayitli olmayan kullanici ile denemeler yapilip login olamadigi dogrulanmistir.

2. **Hata Durumları**

   - **Eksik Bilgi Testi**: Yolcu sayısının eksik olduğu durumlarda hataların doğru şekilde işlendiğini doğrulama.

## **Extent Reports Kullanımı**

Proje, **Extent Reports** ile test sonuçlarını HTML formatında raporlar. Testler çalıştıktan sonra raporlar **`extentReport.html`** dosyası olarak proje dizininde oluşturulacaktır.



