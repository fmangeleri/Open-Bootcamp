import React, { useState} from 'react';

const Cuadrado = () => {

    //const [clase, setClase] = useState('cuadrado')
    const [done, setDone] = useState(false)

    function randomNum() {
        return Math.floor(Math.random() * 256);
    }

    


    function hover() {
        if(!done) {
            var intervalo = setInterval(changeColor(), 500)   

            // Store an array of values for rgb
            function changeColor() {

                var red = randomNum();
                var green = randomNum();
                var blue = randomNum();
                var rgbVals = [red,green,blue];

                // Turn array into an rgb value
                var tempColor = "rgb(" + rgbVals[0] + ", " + rgbVals[1] + ", " + rgbVals[2] + ")";
        
                // Give rgb color to the background
                const element = document.getElementById('cuadrado');
                element.style.backgroundColor = tempColor;

                console.log(tempColor)
            }
        }
        else {
            clearInterval(intervalo)
        }
    }

    function mouseLeave() {
        setDone(false)
        const element = document.getElementById('cuadrado');
        element.style.backgroundColor = 'black';
    }

    function dobleClick() {
        setDone(true)
    }


    return (
        <div 
            id='cuadrado'
            style={{ backgroundColor: 'black' }}
            className={'cuadrado'} 
            onMouseOver={hover} 
            onMouseLeave={mouseLeave}
            onDoubleClick={dobleClick}
        ></div>
    );
}

export default Cuadrado;
