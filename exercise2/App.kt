package id.infinitelearning.KotlinSubmission.exercise2

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini
    for(n : Int in 1..100){
        print("$n")
    }
    println()
    println()
    println("Bilangan Genap")

    for(i : Int in 1..100) {
        if(i % 2 ==0)
        print("$i")
    }




    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
    Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...

    Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */

    // Buat di bawah sini
    println()
    println()
    println()
    val groupMap = mapOf(
        1 to "jan",
        2 to "feb",
        3 to "mar",
        4 to "apr",
        5 to "mei",
        6 to "jun",
        7 to "jul",
        8 to "agus",
        9 to "sep",
        10 to "okt",
        11 to "nov",
        12 to "des"

    )
     val mutableGroupMap = groupMap.toMutableMap()
    println(mutableGroupMap)

    mutableGroupMap[1]="january"
    mutableGroupMap[2]="febuary"
    mutableGroupMap[3]="maret"
    mutableGroupMap[4]="april"
    mutableGroupMap[5]="mei"
    mutableGroupMap[6]="juni"
    mutableGroupMap[7]="july"
    mutableGroupMap[8]="agustus"
    mutableGroupMap[9]="september"
    mutableGroupMap[10]="oktober"
    mutableGroupMap[11]="november"
    mutableGroupMap.put(12 ,"desember")
    println(mutableGroupMap)
}