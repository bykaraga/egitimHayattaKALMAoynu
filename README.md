

<h1 align="center">🏕 Hayatta Kalma Oyunu Eğitimi</h1>

<p align="center">
  <b>Nesne‑yönelimli programlama öğrenirken geliştirdiğim Java tabanlı hayatta kalma oyunu.</b><br>
  OOP kavramlarını pratikleştirmek için tasarlanmış bir uygulama.
</p>

---

<div align="center">

![GitHub repo size](https://img.shields.io/github/repo-size/bykaraga/egitimHayattaKALMAoynu?color=blue)
![GitHub last commit](https://img.shields.io/github/last-commit/bykaraga/egitimHayattaKALMAoynu?color=purple)
![GitHub stars](https://img.shields.io/github/stars/bykaraga/egitimHayattaKALMAoynu?color=yellow)
![License](https://img.shields.io/badge/license‑MIT‑blue.svg)
![Java](https://img.shields.io/badge/language‑Java‑orange?logo=java)

</div>

---

## 🧭 İçindekiler

- [🎯 Amaç](#-amaç)  
- [📚 Kapsam](#-kapsam)  
- [📂 Proje Yapısı](#-proje‑yapısı)  
- [⚙️ Kurulum ve Çalıştırma](#️‑kurulum‑ve‑çalıştırma)  
- [🎮 Oyunun Akışı](#‑oyunun‑akışı)  
- [📘 Teknolojiler](#‑teknolojiler)  
- [🤝 Katkıda Bulunma](#‑katkıda‑bulunma)  
- [📄 Lisans](#‑lisans)

---

## 🎯 Amaç

Bu proje, Java dilinde **nesne yönelimli programlama (OOP)** ilkelerini uygulamalı olarak öğrenmek amacıyla geliştirilmiştir.  
Amacım; oyuncu karakteri, düşmanlar, çevre koşulları gibi nesneleri oluşturarak bir “hayatta kalma oyunu” senaryosu üzerinden OOP’yi pekiştirmektir.

---

## 📚 Kapsam

✅ Sınıf ve nesne oluşturma (Player, Enemy, Item vb.)  
✅ Encapsulation, inheritance, polymorphism gibi OOP kavramları  
✅ Basit oyun döngüsü ve kullanıcı girdi yönetimi  
✅ Konsol tabanlı oyun senaryosu (grafiksel değildir)  
✅ Java SE kullanımı  

---

## 📂 Proje Yapısı

```bash
egitimHayattaKALMAoynu/
│
├── src/
│   ├── com/bykaraga/hayattaK/
│   │   ├── Player.java
│   │   ├── Enemy.java
│   │   ├── Item.java
│   │   ├── GameEngine.java
│   │   └── Main.java
│
├── out/ (derlenmiş dosyalar)
├── .gitignore
├── LICENSE
└── README.md
```

> ⚠️ Dizin ve dosya adları örnektir; senin yapına göre değişiklik gösterebilir.

---

## ⚙️ Kurulum ve Çalıştırma

1️⃣ **Projeyi klonlayın:**
```bash
git clone https://github.com/bykaraga/egitimHayattaKALMAoynu.git
```

2️⃣ **Klasöre girin:**
```bash
cd egitimHayattaKALMAoynu
```

3️⃣ **Java dosyalarını derleyin:**
```bash
javac -d out src/com/bykaraga/hayattaK/*.java
```

4️⃣ **Programı çalıştırın:**
```bash
java -cp out com.bykaraga.hayattaK.Main
```

---

## 🎮 Oyunun Akışı

- Oyuncu (Player) hayatta kalma görevini üstlenir.  
- Düşman (Enemy) ve eşya (Item) nesneleri belirlenir.  
- Oyuncu döngü içinde çevreyle etkileşime girer, düşmanla karşılaşabilir ve eşya toplayabilir.  
- Oyun, oyuncu “hayatta kalamazsa” veya belirli hedefe ulaşırsa sona erer.  

---

## 📘 Teknolojiler

| Teknoloji | Açıklama |
|-----------|----------|
| ☕ **Java SE** | Ana programlama dili |
| 🧩 **OOP Prensipleri** | Encapsulation, Inheritance, Polymorphism |
| 🧠 **Git & GitHub** | Versiyon kontrol sistemi |
| 🖥️ **Terminal / Komut Satırı** | Çalıştırma ortamı |

---

## 🤝 Katkıda Bulunma

Katkılar memnuniyetle karşılanır!  
- Yeni oyun senaryoları ekleyebilir  
- Kod yapısını iyileştirebilir  
- Daha fazla yorum ve dokümantasyon ekleyebilirsin  

Adımlar:  
1. Repo’yu forkla  
2. Yeni bir branch oluştur (`feature/new‑scenario`)  
3. Değişikliklerini commit et  
4. Branch’ini push et  
5. Pull Request gönder 🎉  

---

## 📄 Lisans

Bu proje [MIT Lisansı](LICENSE) ile lisanslanmıştır.  
© 2025 [bykaraga](https://github.com/bykaraga)

---

<p align="center">
  Made with ❤️ by <b>bykaraga</b>
</p>
