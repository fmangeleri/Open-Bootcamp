import React, { useEffect, useState } from 'react'
import '../styles/style.css'

const Clock = () => {

   let fecha = new Date();
   const [edad, setEdad] = useState(0);
   let nombre = 'Martín';
   let apellidos = 'San José';


   useEffect(() => {
      function incrementarEdad(){
         setEdad(edad + 1);
      }
      const timerID = setInterval (() => {
         incrementarEdad()
         //document.h1 = `Edad: ${edad}`
      }, 1000);

      return () => {
         clearInterval(timerID);
      }
   }, [edad])


   return (
      <div>
         <h2>
            Hora Actual: {fecha.toLocaleTimeString()}
         </h2>
         <h3>{nombre} {apellidos}</h3>
         <h1>Edad: {edad}</h1>
      </div>
   ) 
}

export default Clock