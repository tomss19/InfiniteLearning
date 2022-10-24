package id.infinitelearning.KotlinSubmission.exercise4

fun validateandSayHello(name: String) {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
     if(name.isBlank()){
       throw ValidationException("name is blank")
     }else{
         println("hello $name")}

}
fun main(){
    try {
        validateandSayHello("TOMS")
        validateandSayHello("")
    }catch (error : ValidationException){
        println("Logic eror")
    }
}