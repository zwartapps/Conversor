# Conversor
## Tarea UT2 de Programación Multimedia y Dispositivos Móviles

### Unidad de Trabajo 02
#### Diseño de la Interfaz de Usuario
#### Práctica a Entregar
Crear un proyecto Android que permita convertir de Euros (€) a Dólares Americanos ($). El cambio está a:
1 EUR → 1,22600 USD

Creamos el proyecto en Android Studio. El codigo está comentado para entender que hacemos.
Creí conveniente añadir un boton para borrar ambos campos.
También que el resultado solamente mostrará hasta 2 decimales con 
```
 final DecimalFormat df2 = new DecimalFormat(".##");
```
Al ejecutar el codigo me di cuenta que si no introducimos nada en el campo Euros y pulsamos el boton convertir la aplicacion se detenía. 
He corregido esto haciendo un bloque **if, else** si el campo está vacio lanza un toast mensaje que el usuario debe introducir una cantidad,
el codigo queda así:
```
   //Accion de calculo cuando se pulsa el boton de Convertir
        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos un String temporal por si el usuario no introduce nada, aparece un mensaje
                String tmp = textoEuros.getText().toString();

                if (tmp.equalsIgnoreCase("")) {
                    Toast.makeText(getApplicationContext(), "Introduzca una Cantidad", Toast.LENGTH_SHORT).show();
                } else {

                    double d = Double.parseDouble(String.valueOf(textoEuros.getText()));
                    double resultado = d * 1.22600;
                    textoDollar.setText(String.valueOf(df2.format(resultado)));
                }
            }
        });
```

Al final queda así:

<img src="http://i68.tinypic.com/e8rcic.jpg" >

Introducimos una cantidad y pulsamos el boton **Convertir**:

<img src="http://i68.tinypic.com/ekovo7.jpg" >

Cuando no introducimos cantidad y pulsamos el boton **Convertir**, salta el mensaje:

<img src="http://i63.tinypic.com/x6dgsk.jpg" >

Cuando pulsamos el boton **Borrar**, se borran ambos campos:

<img src="http://i68.tinypic.com/e8rcic.jpg" >

### Todo funciona correctamente!



