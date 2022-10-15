import React from 'react';
import PropTypes from 'prop-types';
import { Componente } from  '../clases/componente.class'

const AComponent = ({ componente }) => {
    return (
        <div>
            <p>Nombre: { componente.nombre }</p>
            <p>Apellido: { componente.apellido }</p>
            <p>Email: { componente.email }</p>
            <p>Concetado: { componente.conectado ? 'Contacto En Línea' : 'Contacto No Disponible' }</p>
        </div>
    );
};


AComponent.propTypes = {
    componente: PropTypes.instanceOf(Componente)
};

export default AComponent;