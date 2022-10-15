import React from 'react';
import AComponent from './A_component';
import { Componente } from '../clases/componente.class';

const BListComponents = () => {

    const defaultComponente = new Componente('Franco', 'Angeleri', 'fmangeleri@gmail.com', true);

    return (
        <div>
            <h1>Datos del Desarrollador</h1>
            <AComponent componente={defaultComponente}></AComponent>
        </div>
    );
};



export default BListComponents;
