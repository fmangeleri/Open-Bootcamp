import React, { useRef } from 'react';
import { ContactoObjeto } from '../clases/contacto.class';

const FormContacto = ({ onAddContacto }) => {
    
    const nombre = useRef('')
    const apellido = useRef('')

    function addContacto(e) {
        e.preventDeafault()
        const newContacto = new ContactoObjeto(nombre.current.value, apellido.current.value, true)
        onAddContacto(newContacto);
        nombre.current.value = '';
        apellido.current.value = '';
    }
    
    
    return (
        <div>
            <form onSubmit={addContacto} className="contact-component">
                <h2>Añadir Contacto: </h2>
                <label>Nombre:   
                    <input ref={nombre} name="nombre" placeholder='Ingrese el nombre'></input>
                </label><br/>
                <label>Apellido:   
                    <input ref={apellido} name="apellido" placeholder='Ingrese el apellido'></input>
                </label><br/>
                <button onClick={addContacto} type="submit" className="submit-button"> Añadir </button>
            </form>
        </div>
    );
}

export default FormContacto;