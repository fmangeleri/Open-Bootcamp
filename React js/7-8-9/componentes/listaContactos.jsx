import React, { useState, useEffect } from 'react';
import Contacto from './contacto';
import { ContactoObjeto } from '../clases/contacto.class';
import FormContacto from './formContacto';


const ListaContactos = () => {

    const contacto1 = new ContactoObjeto('Franco', 'Angeleri', true)   
    const contacto2 = new ContactoObjeto('Juan', 'Perez', false)
    const contacto3 = new ContactoObjeto('Esteban', 'Quito', true)

    const [contactos, setContactos] = useState([contacto1, contacto2, contacto3])
    // eslint-disable-next-line no-unused-vars
    const [loading, setLoading] = useState(true);

    useEffect(() => {
        console.log('Contacto modificado');
        setTimeout(() => {
            setLoading(false);
        }, 2000);
        return () => {
            console.log('Lista de contactos se esta desmontar...')
        }
    }, [contactos])



    function deleteContacto(contacto){
        console.log('Eliminar este contacto:', contacto);
        const index = contactos.indexOf(contacto);
        const tempContactos = [...contactos];
        tempContactos.splice(index,1);
        setContactos(tempContactos);
    }

    // eslint-disable-next-line no-unused-vars
    function addContacto(contacto){
        console.log('Agregar este contacto:', contacto);
        const tempContactos = [...contactos];
        tempContactos.push(contacto);
        setContactos(tempContactos);
    }





    const Table = () => {
        return (
            <><table>
                <thead>
                    <tr>
                        <th scope='col'>Nombre</th>
                        <th scope='col'>Apellido</th>
                        <th scope='col'>Estado</th>
                        <th scope='col'>Eliminar</th>
                    </tr>
                </thead>
                <tbody>
                    {contactos.map((contacto, index) => {
                        return (
                            <Contacto
                                key={index}
                                contacto={contacto}
                                remove={deleteContacto}
                            >
                            </Contacto>
                        );
                    }
                    )}
                </tbody>
            </table>
            <div>
                <FormContacto onAddContacto={addContacto}></FormContacto>
            </div></>
        )
    }

    let contactosTable;

    if(contactos.length > 0){
        contactosTable = <Table></Table>
    }else{
        contactosTable = (
        <div>
            <h3>There are no contacts to show</h3>
            <h4>Please, create one</h4>
            <FormContacto onAddContacto={addContacto}></FormContacto>
        </div>
        )
    }

    const loadingStyle = {
        color: 'grey',
        fontSize: '30px',
        fontWeight: 'bold'
    }



    return (
        <div>
            <div className='col-12'>
                <div className='card'>
                    {/* Card Header (title) */}
                    <div className='card-header p-3'>
                        <h5>
                            Your contactos:
                        </h5>
                    </div>
                    {/* Card Body (content) */}
                    <div className='card-body' data-mdb-perfect-scrollbar='true' style={ {position: 'relative', height: '400px'} }>
                        {/* TODO: Add Loading Spinner */}
                        {loading ? (<p style={loadingStyle}>Loading contactos...</p>) : contactosTable}
                    </div>
                </div>
            </div>
            {/*<Taskform add={addTask} length={contactos.length}></Taskform>*/}
        </div>
    );

}

export default ListaContactos;
