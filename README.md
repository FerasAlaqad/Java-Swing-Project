# Java Swing Project

![image](https://user-images.githubusercontent.com/87244886/125461840-bbfede93-ba3e-424e-9510-a00314ebea97.png)






I created an interface using the java swing tools.
Main is the main class. In this project i used arrays to create a login page. You need to create a user and login to access the home page.

feel free to contact me anytime.
email:ferasdc18@gmail.com

here is the explanation in turkish :)




Proje Çıktıları ve Başarı Ölçütleri

•	Programı çalıştırıldığı zaman ilk görünen sayfa giriş sayfası, kullanıcı başarılı bir giriş yapması lazım, başarılı bir giriş yapmadığı müddetçe diğer sayfalara ulaşamayacaktır. Başarılı bir giriş yapabilmek için new User kısminden yeni kullanıcı oluşturulup giriş sayfasında giriş yapmak için kullanılması lazım. New User kısmından oluşturulan tüm user bilgileri ArrayList içeresine kayıt ediliyor, giriş sayfasından giriş yapıldığı zaman o listeleri kontrol ediliyor. (Ayrıca new User sayfasında iki farklı kullancı aynı isimi kullanmaması için bir kontrol mekanizması geliştirildi)

![image](https://user-images.githubusercontent.com/87244886/125458784-06e5a1fc-a75e-4f06-a444-8302091642d7.png)


•	Giriş yapınca Ana sayfa açılıyor,
    
•	Ana sayfada sol kısımda JList vardır, bu listede tüm eklenen entryleri kayıt ediliyor listede her hangi bir entrye basarak o entrye ulaşılabilir, Yorum ekle toşuna basınca yorum eklemek için bir sayfa açılıyor yazar ve yorum kısımları doldurarak yorum yapılabilir.

•	 Sonraki ve önceki butonları ise listeden seçilen entrynin yorumlarının arasında geçiş yapılabilir. 

•	like, Unlike, Share botunları kullanarak seçilen entrye beğenme veya beğenmeme ve paylaşma yapılabilir, Ayrıca Beğenme ve diğer butonların basılma sayısı kayıt edilir ve programı tekrar çalıştırınca görünür. (Aşağıdaki kısımlarda detaylıca anlatılacak)

•	Entry Sil botunu kullanarak listeden seçilen Entry silinebilir, ve silince listeyi otomatik güncellenir.

•	Entry Ekle butonu kullanarak yeni bir Entry oluşturulabilir, ve otomatik olarak oluşturulan yeni Entry ArrayList eklenir, ve aynı zamanda Ana sayfadaki Jlist güncellenir.

•	  Export butonu kullanarak listeye eklenen tüm entryleri ve bu entrylere yapılan tüm yorumlarının ayrıntıları bilgisayara txt dosyası içerisinde yazdırılır, ayrıca Entry sınıfıdaki özellikleri Like sayısı gibi de export edilir.

•	İmport butonu Export botunun yaprığı şeyin tersi yapar.

•	Ana sayfanın üst kısmında yazılan “Feras Hoşgeldiniz” ibaresi başka bir user ile giriş yapıldığında değişiyor.
