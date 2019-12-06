package feri.com.indonesiaku.data

import feri.com.indonesiaku.model.Senjata
import feri.com.indonesiaku.R

object DataSenjata {
    fun generateSenjata():List<Senjata> {
        val senjata: ArrayList<Senjata> = ArrayList()
        senjata.add(
            Senjata(
                "Klewang",
                "Sumatera Selatan",
                "Berupa pedang bermata satu yang panjang, klewang berada di antara golok dan kampilan. Karena Indonesia terdiri dari bebagai macam budaya, ukuran klewang semakin bervariasi. Umumnya, klewang memiliki panjang 38 sampai 76 cm. Ada klewang yang di bagian ujungnya dibuat lurus, ada pula yang dibuat melengkung.\n" +
                        "Klewang atau kelewang dulu digunakan pada saat Perang Aceh. Senjata satu ini sangat efektif apabila digunakan untuk pertarungan jarak dekat. Oleh pasukan Belanda, senjata kelewang ini cukup ditakuti. Masyarakat Sumatra Selatan pada jaman dulu membawa kelewang untuk berjaga-jaga bila diserang.",
                R.drawable.klewang.toString()
            )
        )

        senjata.add(
            Senjata(
                "Kurambiak",
                "Minangkabau",
                "Kalian yang pernah menonton film Indonesia berjudul The Raid, pasti ada pernah melihat senjata kecil satu ini. Senjata ini dinamakan karambit atau nama lainnya adalah kurambiak. Awalnya, tidak banyak orang sadar bahwa senjata kecil keren ini ternyata senjata asli Indonesia. Merupakan senjata asli yang dipercaya berasal dari Minangkabau, Sumatra Barat.\n" +
                        "Kini, kurambiak atau kerambit penyebarannya sudah sampai ke Malaysia, Filipina, dan beberapa negara di Eropa. Bentuknya mirip dengan cakar dari macan. Oleh masyarakat Minangkabau, kerambit sering dimanfaatkan untuk mencabut akar dan menanam nasi. Karena bentuknya yang kecil dan melengkung, kerambit dijadikan senjata bela diri yang bisa membuat luka potong yang cukup serius.",
                R.drawable.kurambiak.toString()
            )
        )

        senjata.add(
            Senjata(
                "Rencong",
                "Aceh",
                "Berpindah ke Aceh, Aceh memiliki senjata tradisional yang bisa dibilang mirip dengan pisau. Senjata tradisional ini disebut dengan nama rencong, sebuah senjata tajam dengan panjang menyamai pisau. Senjata tradisional ini memiliki sejarah yang kuat di tanah Aceh dan telah menjadi simbol pria Aceh di masa lalu.\n" +
                        "Di era penjajahan, orang-orang Aceh menggunakan senjata rencong ini untuk berperang dan mengusir lawan. Sampai sekarang, rencong masih tetap dijadikan senjata beladiri. Beberapa komunitas atau suku di Aceh, menganggap rencong sebagai senjata pusaka. Beberapa ada yang menganggapnya sebagai jimat.",
                R.drawable.rencong.toString()
            )
        )

        senjata.add(
            Senjata(
                "Belati",
                "Papua",
                "Salah satu senjata tradisional dari Papua adalah pisau belati. Berbeda dengan pisau kebanyakan yang menggunakan bahan logam, orang Papua menciptakan senjata pisau belati dari bahan dasar tulang. Tulang yang digunakan sebagai bahan pembuat belati adalah tulang kaki dari burung kasuari yang banyak ditemukan disana.\n" +
                        "Pisau belati, bersamaan dengan busur dan panah, menjadi senjata tradisional masyarakat Papua. Baik itu jaman dulu, sampai sekarang. Busur menggunakan bahan dari bambu atau pohon. Untuk tali busur, menggunakan bahan rotan. Nah untuk panahnya, orang Papua menggunakan bahan bambu, kayu atau tulang kangguru. Pisau belati, busur, dan panah digunakan untuk beburu hewan atau perang.",
                R.drawable.belati.toString()
            )
        )

        senjata.add(
            Senjata(
                "Parang",
                "Maluku",
                "Di jaman masa penjajahan Belanda, orang Maluku memanfaatkan satu senjata yang digunakan untuk berperang melawan penjajah. Senjata tersebut adalah parang salawaki, sebut saja dengan nama singkatnya, parang. Bila dibandingkan dengan pisau, parang ini memiliki ukuran yang jauh lebih besar.\n" +
                        "Sedikit mengulas sejarah masa kelam Indonesia, di Maluku, ada sosok pahlawan sejarah yang sangat berjasa besar dalam berperang melawan pasukan Belanda yakni Thomas Matulessy atau yang biasa dikenal dengan Kapitan Pattimura. Nah, Pattimura ini menggunakan parang sebagai senjata untuk melawan pasukan Belanda.",
                R.drawable.parang.toString()
            )
        )

        senjata.add(
            Senjata(
                "Clurit/Sabit",
                "Madura",
                "Senjata di atas seharusnya sudah tidak asing lagi bagi kita, orang Indonesia. Di beberapa berita, senjata ini sering muncul karena sering digunakan sebagai alat kekerasan seperti begal, rampok, dan tawuran. Bentuknya yang mirip dengan bulan sabit, membuat senjata ini diberi nama sabit atau clurit. Berasal dari Madura.\n" +
                        "Pada dasarnya, clurit merupakan alat yang digunakan untuk memotong rumput untuk diberikan pada sapi. Sekarang, clurit lebih sering digunakan sebagai alat kriminal. Meski asli senjata tradisional Madura, penyebaran clurit ini sudah sangat luas. Bahkan sampai ke Pulau Jawa. Di Jawa, senjata ini dikenal dengan sebutan sabit.",
                R.drawable.clurit.toString()
            )
        )

        senjata.add(
            Senjata(
                "Kujang",
                "Sunda",
                "Orang-orang jaman sekarang mungkin lebih mengenal senjata ini dengan sebutan bedok. Di jaman dulu, senjata ini lebih dikenal dengan sebutan kujang. Inilah senjata yang bisa dibilang goloknya orang Sunda. Sementara golok sendiri merupakan senjata khas orang Betawi yang akan kita bahas di poin berikutnya.\n" +
                        "Kujang atau bedok ini memiliki bentuk yang unik. Paling banyak ditemukan dan digunakan oleh orang-orang Jawa Barat. Oleh masyarakat Jawa Barat, bedok atau kujang lebih sering digunakan oleh mereka yang berprofesi sebagai petani. Bedok lebih sering dibawa karena lebih praktis, sedangkan kujang sendiri lebih sering disimpan sebagai koleksi.",
                R.drawable.kujang.toString()
            )
        )

        senjata.add(
            Senjata(
                "Badik",
                "Sulawesi",
                "Bila ada yang mengira ini adalah senjata tradisional rencong dari Aceh, kalian salah. Bentuknya memang mirip dengan rencong, tapi ini merupakan senjata yang dinamakan badik. Badik memiliki bentuk yang mirip dengan pisau atau rencong dari Aceh, dan, senjata ini merupakan senjata tradisional orang Bugis-Makassar.\n" +
                        "Setiap senjata pasti memiliki sejarahnya masing-masing, begitu pula dengan badik ini. Oleh orang Sulawesi, terutama ketika jaman kerajaan, badik digunakan sebagai alat pertahan diri. Oleh orang-orang jaman dulu, mereka selalu menyelipkan badik di belakang atau samping pinggang. Tidak hanya orang-orang tua yang membawa badik, bahkan yang muda pun selalu terlihat membawa badik di sampingnya.",
                R.drawable.badik.toString()
            )
        )

        senjata.add(
            Senjata(
                "Keris",
                "Jawa",
                "Bagi penduduk yang di tinggal di Pulau Jawa, pasti sudah familiar dengan senjata yang berliku-liku ini. Keris, begitulah senjata ini dinamakan. Keris merupakan senjata tradisional khas Pulau Jawa, terutama di kota Yogyakarta dan Jawa Tengah. Dimana 2 lokasi itu, keris tidak hanya dijadikan senjata, melainkan barang yang disucikan.\n" +
                        "Di budaya orang Jawa, keberadaan keris dianggap sebagai benda sakti atau benda suci. Tidak jarang orang-orang menyimpan keris selain untuk koleksi, senjata, dan juga jimat. Panjang suatu keris berbeda-beda, namun umumnya sama seperti pisau. Hanya saja keris dibuat berliku. Di Jawa Tengah, keris digunakan sebagai tanda penghormatan, terutama bagi suatu kerajaan.",
                R.drawable.keris.toString()
            )
        )

        senjata.add(
            Senjata(
                "Golok",
                "Betawi",
                "Sosok Si Pitung merupakan pendekar asal Betawi yang juga berperang melawan ketidakadilan yang dilakukan pada masa penjajahan Belanda. Cerita Pitung terus menerus diceritakan secara turun menurun hingga masih terkenal sampai sekarang. Kenapa kita membahas Pitung dan Betawi, itu karena Pitung menggunakan sebuah senjata tradisional dari Betawi yang dinamakan golok.\n" +
                        "Golok, fungsi senjata tradisional Betawi ini tidak berubah dari masa ke masa. Hingga sekarang, golok digunakan sehari-hari sebagai alat membela diri. Orang asli Betawi, dipastikan memiliki golok di dalam rumahnya. Kemanapun mereka pergi, golok selau dibawa dan diselipkan di pinggang. Golok juga digunakan sebagai senjata di pencak silat.",
                R.drawable.golok.toString()
            )
        )
        return senjata
    }

    fun getSearchData(query:String):ArrayList<Senjata>{
        val listsenjata: ArrayList<Senjata> = ArrayList()
        for ( senjata in DataSenjata.generateSenjata()){
            if (senjata.nama?.toLowerCase()!!.contains(query.toLowerCase())){
                listsenjata.add(senjata)
            }
        }
        return listsenjata
    }
}