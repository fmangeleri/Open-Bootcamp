import React from 'react';
import PropTypes from 'prop-types';
import { ContactoObjeto } from '../clases/contacto.class';


const Contacto = ({ contacto, remove }) => {



    function contactoEstadoBadge(){
        switch (contacto.estado) {
            case true:
                return(
                <h6 className='mb-0'>
                    <span className='glyphicon glyphicon-ok-circle' style={{color: 'green'}}>
                        {contacto.estado}
                    </span>
                </h6>)
            case false:
                return(
                <h6 className='mb-0'>
                    <span className='glyphicon glyphicon-remove-circle'style={{color: 'red'}}>
                        {contacto.estado}
                    </span>
                </h6>)
            default:
                break;
        }
    }


    return (
        <tr className='fw-normal'>
            <th>
                <span className='ms-2'>{contacto.nombre}</span>
            </th>
            <td className='align-middle'>
                <span>{contacto.apellido}</span>
            </td>
            <td className='align-middle'>
                {/* Execution of function to return badge element */}
                {contactoEstadoBadge()}
            </td>
            <td className='align-middle'>
                {/* Execution of function to return icon depending on completion */}
                {/*taskCompletedIcon()*/}
                <i className='glyphicon glyphicon-trash' style={{color: 'tomato'}} onClick={() => remove(contacto)}></i>
            </td>
        </tr>
    );
};



Contacto.propTypes = {
    task: PropTypes.instanceOf(ContactoObjeto).isRequired,
    remove: PropTypes.func.isRequired
};


export default Contacto;
