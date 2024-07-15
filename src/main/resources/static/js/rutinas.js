/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */


/* 
Esta funciona carga lainfo de una imagen y la coloca en una etiqueta img
 */


function readURL(input){
    if (input.file && input.files[0]){
        var reader = new FileReader();
        reader.onload = function (e){
            $('#blah').attr('src',e.target.result.height(200));
        };
        reader.readAsDataURL(input.files[0]);
    }
}
