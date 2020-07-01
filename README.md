# APPL1_181524002_SOLID

01.Stream Project
Solusi yang diberikan untuk kasus ini yaitu dengan membuat 1 interface yang berisi method-method
general yang memungkinkan dibutuhkan untuk class lainnya. Disamping itu dari pembuatan class yang 
terdapat dalam project ini sudah memiliki tujuan yang spesifik.

02.Graphics Editor
Mirip seperti persoalan pertama, solusi yang diberikan untuk kasus ini yaitu dengan membuat 1 interface yang berisi method-method
general yang memungkinkan dibutuhkan untuk class lainnya. Dengan permintaan bahwa sistem bisa saja
menambahkan shape baru maka setiap shape perlu dijadikan sebagai class.

03.Detail Printer
Solusi yang diberikan untuk kasus ini yaitu dengan menjadikan Employee superclass yang akan mewariskan
method nya pada manager. Class detailprinted kini tidak perlu mengetahui jenis dari object yang diprint

04.Recharger
Solusi yang diberikan untuk kasus ini yaitu dengan membuat 2 interface ISleeper dan IRechargeable. Serta
menjadikan class Robot extends Worker dan IRechargeable sehingga ia memiliki 2 method override yaitu
Recharge() dan Sleep()

05.Security Door
Solusi yang diberikan untuk kasus ini yaitu dengan membuat 2 kelas KeyCardCheck dan PinCodeCheck dimana 
objek kelas ini akan menjadi atribut dari kelas SecurityManager, sehingga Security Manager dapat memvalidasi key dan pin tersebut.
dimana cara memvalidasi dari masing-masing class berbeda namun tetap harus memiliki method ValidateUser(). Sehingga
method ValidateUser() perlu dijadikan sebuah superclass tersendiri.
