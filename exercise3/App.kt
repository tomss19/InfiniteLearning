package id.infinitelearning.KotlinSubmission.exercise3


private fun Nothing?.log(scoreChecker: Any) {

}

fun main() {

    /** Latihan 1
    Buatlah logika if untuk mengevaluasi nilai score dengan ketentuan:
    1. Jika nilai score lebih atau sama dengan 90
    - Isi variabel result dengan nilai: 'Selamat! Anda mendapatkan nilai A.'
    2. Jika nilai score ada di antara 80 hingga 89
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai B.'
    3. Jika nilai score ada di antara 70 hingga 79
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai C.'
    4. Jika nilai score ada di antara 60 hingga 69:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai D.'
    5. Jika nilai score di bawah 60:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai E.'
     */
    // Buat di bawah sini
    var nilai1 = 90
    var nilai2 = 80
    var nilai3 = 70
    var nilai4 = 60

    if (nilai1 <= 90){
        print("Selamat nilai Anda 90 , anda mendapatkan nilai A")
    }else{
        print("coba lagi ya")
    }
    println()
    if (nilai2 <=89){
        print(" nilai Anda 85 Anda mendapatkan nilai B")
    }else{
        print("coba lagi ya")
    }
    println()
    if(nilai3 <=79){
        print(" nilai Anda 70 Anda mendapatkan nilai C")
    }else{
        print("coba lagi ya")
    }
    println()
    if(nilai4 <= 69){
        print(" nilai Anda 65 Anda mendapatkan nilai D")
    }else {
        print("coba lagi ya")
    }
    println()
    if(nilai4 >= 60){
        print(" nilai Anda 59 Anda mendapatkan nilai E")
    }else{
        print("coba lagi ya")
    }


}