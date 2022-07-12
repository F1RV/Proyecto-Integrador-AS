function VerificarUsuario(){
    var txtUsuario = document.getElementById("txtUsuario").value;
    var txtPassword = document.getElementById("contraseña").value;
    
    if (txtUsuario == "admin" && txtPassword == "admin") {
        console.log(txtUsuario + txtPassword);
        window.location.href = "/admin";
    } else {
        console.log("Contraseña Incorrecta ");
        console.log(txtUsuario + txtPassword);
    }
};