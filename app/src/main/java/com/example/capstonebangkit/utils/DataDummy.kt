package com.example.capstonebangkit.utils

import com.example.capstonebangkit.R
import com.example.capstonebangkit.model.About
import com.example.capstonebangkit.model.Guide

object DataDummy {

    fun generateAbout() : List<About>{

        val aboutList = ArrayList<About>()

        aboutList.add(
                About(
                        R.drawable.img_about_franchise,
                        "Apa itu Franchise?",
                        "Dalam bahasa Indonesia, arti franchise adalah waralaba. Franchise adalah bisnis yang mendirikan usaha menggunakan merek dagang usaha lain tetapi pihak pewaralaba harus membayar biaya awal dan royalti secara berkelanjutan.\n" +
                                "\n" +
                                "Sederhananya, Anda mendirikan usaha dengan merek yang sudah ada. Sehingga Anda tidak perlu mencari konsumen baru sebab sebelumnya orang telah mengenal merek tersebut.\n" +
                                "\n" +
                                "Tak hanya merek dagang saja yang diperoleh, namun pewaralaba juga mendapatkan keuntungan berupa dukungan, sistem bisnis, dan suplai produksi."
                )
        )
        aboutList.add(
                About(
                        R.drawable.img_about_reseller,
                        "Apa itu Reseller?",
                        "Reseller adalah perusahaan atau individu (pedagang) yang membeli barang atau jasa dengan tujuan untuk menjualnya daripada mengkonsumsi atau menggunakannya. Ini biasanya dilakukan untuk mendapatkan keuntungan (tapi bisa dijual kembali dengan kerugian). Salah satu contoh dapat ditemukan di industri telekomunikasi, di mana perusahaan membeli kapasitas transmisi atau waktu panggilan yang berlebihan dari operator lain dan menjualnya kembali ke operator yang lebih kecil.\n" +
                                "\n" +
                                "Menurut Institute for Partner Education & Development, model bisnis berbasis pemenuhan produk pengecer mencakup pengecer korporat, pengecer, pengecer pasar langsung (DMR), dan pengecer internet (eTailer); kurang dari 10 persen pendapatannya berasal dari jasa."
                )
        )
        return aboutList

    }
    fun generateGuide() : List<Guide>{

        val guideList = ArrayList<Guide>()

        guideList.add(
                Guide(
                        R.drawable.img_franchise2,
                        "Bagaimana menjadi seoarang franchiser?",
                        "Cara Menjalankan Bisnis Franchise\n" +
                                "Tertarik untuk memulai franchise? Berikut langkah-langkah memulai franchise adalah:.\n" +
                                "\n" +
                                "1. Riset pasar\n" +
                                "Cara memulai franchise yang pertama dengan melakukan riset. Riset pasar dilakukan dengan melihat produk yang sedang naik daun, produk yang diminati atau dibutuhkan oleh masyarakat.\n" +
                                "\n" +
                                "2. Riset penyedia franchise\n" +
                                "Langkah berikutnya dengan melakukan riset penyedia franchise. Kenali secara mendalam franchise tersebut baik dari segi harga, popularitas brand, produk, sop, dan perjanjian kontrak.\n" +
                                "\n" +
                                "3. Memilih jenis franchise yang tepat\n" +
                                "Setelah memiliki gambaran terkait franchise, silahkan pertimbangkan secara matang untuk memilih salah satu jenis franchise. Usahakan memilih franchise sesuai kemampuan, misalnya dari segi harga, sop jumlah karyawan, penyajian makanan, dan sejenisnya. Sebab hal ini sangat penting dan akan berpengaruh pada perkembangan bisnis.\n" +
                                "\n" +
                                "4. Mengikuti pelatihan dan proses standarisasi\n" +
                                "Setiap franchisor akan mengadakan pelatihan untuk calon mitranya agar dapat menjalankan bisnis secara baik. Dalam hal ini, franchisor akan memberikan sosialisasi terkait bisnis yang akan dijalankan. Setelah itu, Anda akan memperoleh pelatihan proses standarisasi agar mengetahui kelayakan franchisee sebagai mitra.\n" +
                                "\n" +
                                "5. Aksi dan evaluasi\n" +
                                "Langkah terakhir memulai franchise adalah menjalankan usaha tersebut. Pastikan Anda mengikuti seluruh prosedur dan menjalankannya sesuai sop dan perjanjian dengan franchisor. Terakhir melakukan evaluasi dalam periode tertentu. Anda bisa mengkonsultasikan dengan franchisor saat pembinaan atau pelatihan berikutnya."
                )
        )
        guideList.add(
                Guide(
                        R.drawable.img_reseller2,
                        "Bagaimana menjadi seoarang reseller?",
                        " jika kamu ingin merintis sebagai seorang reseller, maka perhatikan cara menjadi reseller berikut ini!\n" +
                                "\n" +
                                "1. Gunakan Media Sosial untuk Promosi\n" +
                                "Saat ini media sosial memiliki kekuatan yang besar lho sebagai ajang promosi.\n" +
                                "\n" +
                                "Maka dari itu, penting hukumnya untuk kamu memakai media sosial sebagai ajang promosi produk.\n" +
                                "\n" +
                                "Sebaiknya kamu membuat media sosial khusus bisnis, agar tidak bercampur dengan media pribadimu.\n" +
                                "\n" +
                                "Hal penting lain yg harus kamu catat adalah, media sosial memiliki pasar masing-masing, jadi pastikan kamu memberikan konten yang memang sesuai dengan pasarmu.\n" +
                                "\n" +
                                "2. Membangun Relasi\n" +
                                "Tidak hanya bisnis biasa saja yang butuh relasi, seorang reseller juga harus pandai menciptakan relasi.\n" +
                                "\n" +
                                "Jalin hubungan yang baik dengan beragam supplier, dengan begitu kamu juga bisa mengadakan kerja sama dengan mereka.\n" +
                                "\n" +
                                "Bahkan, dengan tak segan supplier bisa saja mempromosikan toko online kamu secara cuma-cuma, lho.\n" +
                                "\n" +
                                "Selain itu, jalin juga relasi dengan para pelanggan kamu.\n" +
                                "\n" +
                                "Kamu bisa lho memberikan promo atau hal spesial lainnya kepada pelanggan kamu yang paling loyal.\n" +
                                "\n" +
                                "Dengan begitu, mereka tidak hanya senang, tapi juga bisa membagikan informasi tentang produk kamu ke teman-temannya.\n" +
                                "\n" +
                                "3. Memahami Produk yang Kamu Jual\n" +
                                "Jangan sekali-kali kamu menjual produk yang tidak kamu kenal secara baik.\n" +
                                "\n" +
                                "Mungkin saja kamu akan mendapatkan untung, tapi kamu pasti kesulitan untuk menjalankannya.\n" +
                                "\n" +
                                "Pasalnya kamu tidak mengetahui hal apapun dari industri tersebut, tidak mudah nantinya untuk tahu bagaimana cara berjualan yang tepat kepada konsumen.\n" +
                                "\n" +
                                "Selain itu, jangan lupa kalau konsumen pasti akan bertanya kepada kamu perihal produk yang kamu jual.\n" +
                                "\n" +
                                "Tidak mungkin, bukan kalau kamu tidak memahami informasi dari produk tersebut?\n" +
                                "\n" +
                                "Bisa jadi kalau seperti itu, pelanggan akan pergi dan pindah ke lain hati.\n" +
                                "\n" +
                                "4. Perhatikan dengan Baik Perihal Pembagian Komisi\n" +
                                "Namanya menjalankan bisnis, tentu saja hal yang dituju adalah profit atau keuntungan.\n" +
                                "\n" +
                                "Nah, maka dari itu sejak awal reseller menjalin kerjasama dengan supplier, pastikan dengan baik bagaimana pembagian komisinya.\n" +
                                "\n" +
                                "Semua harus jelas komunikasinya, jangan sampai terlewat dan nantinya malah salah informasi lalu kamu jadi merugi.\n" +
                                "\n" +
                                "5. Jangan Menyetok Terlalu Banyak\n" +
                                "Sebagai reseller, kamu harus membeli atau menyetok barang terlebih dahulu sebelum dijual.\n" +
                                "\n" +
                                "Biasanya supplier juga akan memberi ketentuan, berapa banyak pembelian yang harus dilakukan, minimal 1 lusin.\n" +
                                "\n" +
                                "Perlu dicatat bahwa kamu tidak perlu menyetok barang terlalu banyak, karena jika tidak laku akan membuatmu merugi.\n" +
                                "\n" +
                                "Sebaiknya lakukan cek ombal terlebih dahulu, dan  lakukan analisa minat pasar.\n" +
                                "\n" +
                                "Jika dirasa produk tersebut memang banyak peminatnya, barulah menyetok dalam jumlah yang bijak.\n" +
                                "\n" +
                                "6. Pilih Produk yang Peluangnya Besar di Pasaran\n" +
                                "Salah satu tantangan dari reseller adalah kompetitor yang banyak.\n" +
                                "\n" +
                                "Mencari produk yang lebih niche, bisa menjadi salah satu cara mengatasinya.\n" +
                                "\n" +
                                "Tapi saat mencari produk yang niche, pastikan kamu juga menganalisa bahwa potensi pasar dari produk tersebut besar.\n" +
                                "\n" +
                                "Jadi, walaupun produk yang kamu jual memang bukan produk umum untuk semua orang dan konsumenya sedikit, tapi konsumen tersebut loyal dan dapat melakukan pembelian berulang terus menerus.\n" +
                                "\n" +
                                "7. Pastikan Supplier Berkualitas\n" +
                                "Salah satu kesuksesan seorang reseller bisa ditentukan dari bagaimana memilih supplier.\n" +
                                "\n" +
                                "Dalam jangka panjang, seorang reseller akan melakukan kerja sama bisnis dengan supplier, dalam hal pengiriman barang dan lain sebagainya.\n" +
                                "\n" +
                                "Maka dari itu, pilihlah supplier berkualitas yang juga memiliki produk yang jelas.\n" +
                                "\n"
                )
        )
        return guideList
    }
}