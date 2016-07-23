/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroproyectoprogra;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author bismarck
 */
public class RegistroProyectoProgra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Empleado> Empleados = new ArrayList<Empleado>();
        ArrayList<Persona> Clientes = new ArrayList<Persona>();

        int opc = 0;
        do {

            opc = Integer.parseInt(JOptionPane.showInputDialog("Menu de bienvenida\n"
                    + "******************\n"
                    + "1_ Ingresar Nuevo Empleado\n"
                    + "2_Buscar Empleado\n"
                    + "3_Eliminar Empleado\n"
                    + "4_Ingresar Cliente Nuevo\n"
                    + "5_Buscar Cliente\n"
                    + "6_Eliminar Cliente\n"
                    + "7_Salir"));

            switch (opc) {

                case 1:

                    Date date = new Date();

                    Empleado objEmpleados = new Empleado();
                    JOptionPane.showMessageDialog(null, date);
                    String nombre = JOptionPane.showInputDialog("Ingresar Nombre");
                    if (nombre.length() == 0) {
                        nombre = JOptionPane.showInputDialog("Este campo no puede estar vacio ingrese dato solicitado ");
                    }
                    String apellido = JOptionPane.showInputDialog("Ingrese Apellido");
                    if (apellido.length() == 0) {
                        apellido = JOptionPane.showInputDialog("Este campo no puede estar vacio ingrese dato solicitado ");
                    }
                    String licencia = JOptionPane.showInputDialog("Ingresar la licencia del empleado");
                    if (licencia.length() == 0) {
                        licencia = JOptionPane.showInputDialog("Este campo no puede estar vacio ingrese dato solicitado ");
                    }
                    String email = JOptionPane.showInputDialog("Ingresar correo del empleado");
                    if (email.length() == 0) {
                        email = JOptionPane.showInputDialog("Este campo no puede estar vacio ingrese dato solicitado ");
                    }
                    String direccion = JOptionPane.showInputDialog("Ingresar dirección del empleado");
                    if (direccion.length() == 0) {
                        direccion = JOptionPane.showInputDialog("Este campo no puede estar vacio ingrese dato solicitado ");
                    }
                    String telefono = JOptionPane.showInputDialog("Ingresar telefono del empleado");
                    if (telefono.length() == 0) {
                        telefono = JOptionPane.showInputDialog("Este campo no puede estar vacio ingrese dato solicitado ");
                    }
                    String placa = JOptionPane.showInputDialog("Registrar placa");
                    if (placa.length() == 0) {
                        placa = JOptionPane.showInputDialog("Este campo no puede estar vacio ingrese dato solicitado ");
                    }
                    char genero = JOptionPane.showInputDialog("favor  ingrese su genero \n"
                            + " M=Masculino\n"
                            + " F=Femenino").charAt(0);

                    int id = Integer.parseInt(JOptionPane.showInputDialog("Ingresar identificación del empleado"));
                    
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresar edad del empleado"));

                    objEmpleados.setNombre(nombre);
                    objEmpleados.setApellido(apellido);
                    objEmpleados.setEmail(email);
                    objEmpleados.setLicencia(licencia);
                    objEmpleados.setGenero(genero);
                    objEmpleados.setTelefono(telefono);
                    objEmpleados.GetTaxi().setPlaca(placa);
                    objEmpleados.setId(id);
                    objEmpleados.setEdad(edad);
                    objEmpleados.setDireccion(direccion);
                    objEmpleados.setTelefono(telefono);
                    objEmpleados.setFechaIngreso(date);
                    Empleados.add(objEmpleados);
                    JOptionPane.showMessageDialog(null, "Usted a ingresado a un empleado volvera al menu principal");

                    break;

                case 2:

                    int opcion;
                    opcion = Integer.parseInt(JOptionPane.showInputDialog("Buscar empleado por:\n"
                            + "1_ID\n"
                            + "2_NumeroPlaca"));
                    switch (opcion) {

                        case 1:
                            int ID = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID a buscar"));
                            int encontrado = 0;
                            for (int i = 0; i < Empleados.size(); i++) {
                                if (Empleados.get(i).getId() == ID) {
                                    JOptionPane.showMessageDialog(null, "Empleado encontrado...!\n" + "Nombre: " + Empleados.get(i).getNombre() + "\n"
                                            + "Apellido: " + Empleados.get(i).getApellido() + "\n"
                                            + "Telefono: " + Empleados.get(i).getTelefono() + "\n"
                                            + "Direccion: " + Empleados.get(i).getDireccion() + "\n"
                                            + "Email: " + Empleados.get(i).getEmail() + "\n"
                                            + "Edad: " + Empleados.get(i).getEdad() + "\n"
                                            + "ID: " + Empleados.get(i).getId() + "\n"
                                            + "Licencia: " + Empleados.get(i).getLicencia() + "\n"
                                            + "Genero: " + Empleados.get(i).getGenero() + "\n"
                                            + "Fecha Ingreso:" + Empleados.get(i).getFechaIngreso() + "\n"
                                            + "Numero Placa: " + Empleados.get(i).GetTaxi().getPlaca());
                                    encontrado = 1;

                                }

                            }
                            if (encontrado == 0) {
                                JOptionPane.showMessageDialog(null, "Lo sentimos el empleado que buscas no existe");
                            }
                            break;

                        case 2:
                            String numeroPlaca = JOptionPane.showInputDialog("ingrese el numero de placa a buscar");
                            int encontrado2 = 0;
                            for (int i = 0; i < Empleados.size(); i++) {
                                if (numeroPlaca.equals(Empleados.get(i).GetTaxi().getPlaca())) {
                                    JOptionPane.showMessageDialog(null, "Empleado encontrado...!\n" + "Nombre: " + Empleados.get(i).getNombre() + "\n"
                                            + "Apellido: " + Empleados.get(i).getApellido() + "\n"
                                            + "Telefono: " + Empleados.get(i).getTelefono() + "\n"
                                            + "Direccion: " + Empleados.get(i).getDireccion() + "\n"
                                            + "Email: " + Empleados.get(i).getEmail() + "\n"
                                            + "Edad: " + Empleados.get(i).getEdad() + "\n"
                                            + "ID: " + Empleados.get(i).getId() + "\n"
                                            + "Licencia: " + Empleados.get(i).getLicencia() + "\n"
                                            + "Genero: " + Empleados.get(i).getGenero() + "\n"
                                            + "Fecha Ingreso:" + Empleados.get(i).getFechaIngreso() + "\n"
                                            + "Numero Placa: " + Empleados.get(i).GetTaxi().getPlaca());
                                    encontrado2 = 1;
                                }

                            }
                            if (encontrado2 == 0) {
                                JOptionPane.showMessageDialog(null, "Lo sentimos el empleado que buscas no existe");
                            }

                            break;
                    }
                    break;

                case 3:
                    String nom = JOptionPane.showInputDialog("Ingrese el nombre del empleado que quiere borrar..!");
                    for (int i = 0; i < Empleados.size(); i++) {

                        if (nom.equals(Empleados.get(i).getNombre())) {
                            Empleados.remove(i);
                            JOptionPane.showMessageDialog(null, "EMPLEADO ELIMINADO");
                        }

                    }

                    break;

                case 4:

                    Date date1 = new Date();
                    Persona objpersona = new Persona();
                    JOptionPane.showMessageDialog(null, date1);
                    String nombre1 = JOptionPane.showInputDialog("Ingresar Nombre");
                    if (nombre1.length()==0) {
                       nombre1=JOptionPane.showInputDialog("Este campo no puede estar vacio ingrese dato solicitado ");
                    }
                    String apellido1 = JOptionPane.showInputDialog("Ingrese Apellido");
                    if (apellido1.length()==0) {
                       apellido1=JOptionPane.showInputDialog("Este campo no puede estar vacio ingrese dato solicitado ");
                    }
                    String email1 = JOptionPane.showInputDialog("Ingresar correo");
                    if (email1.length()==0) {
                       email1=JOptionPane.showInputDialog("Este campo no puede estar vacio ingrese dato solicitado ");
                    }
                    String direccion1 = JOptionPane.showInputDialog("Ingresar dirección cliente");
                    if (direccion1.length()==0) {
                       direccion1=JOptionPane.showInputDialog("Este campo no puede estar vacio ingrese dato solicitado ");
                    }
                    String telefono1 = JOptionPane.showInputDialog("Ingresar telefono del cliente");
                    if (telefono1.length()==0) {
                       telefono1=JOptionPane.showInputDialog("Este campo no puede estar vacio ingrese dato solicitado ");
                    }
                    char genero1 = JOptionPane.showInputDialog("favor  ingrese  genero cliente \n"
                            + "M= Masculino\n"
                            + "F= Femenino").charAt(0);
                    int id1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar identificación del empleado"));
                    int edad1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar edad del empleado"));

                    objpersona.setNombre(nombre1);
                    objpersona.setApellido(apellido1);
                    objpersona.setEmail(email1);
                    objpersona.setDireccion(direccion1);
                    objpersona.setTelefono(telefono1);
                    objpersona.setGenero(genero1);
                    objpersona.setId(id1);
                    objpersona.setEdad(edad1);
                    objpersona.setFechaIngreso(date1);
                    Clientes.add(objpersona);
                    JOptionPane.showMessageDialog(null, "Cliente ingresado volvera al menu principal");
                    break;

                case 5:
                    int Id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del cliente que desea buscar..!"));
                    int encontrado1 = 0;
                    for (int i = 0; i < Clientes.size(); i++) {
                        if (Clientes.get(i).getId() == Id) {
                            JOptionPane.showMessageDialog(null, "Cliente encontrado...!\n" + "Nombre: " + Clientes.get(i).getNombre() + "\n"
                                    + "Apellido: " + Clientes.get(i).getApellido() + "\n"
                                    + "Telefono: " + Clientes.get(i).getTelefono() + "\n"
                                    + "Direccion: " + Clientes.get(i).getDireccion() + "\n"
                                    + "Email: " + Clientes.get(i).getEmail() + "\n"
                                    + "Edad: " + Clientes.get(i).getEdad() + "\n"
                                    + "ID: " + Clientes.get(i).getId() + "\n"
                                    + "Genero: " + Clientes.get(i).getGenero() + "\n"
                                    + "Fecha Ingreso:" + Clientes.get(i).getFechaIngreso() + "\n");
                            encontrado1 = 1;

                        }

                    }
                    if (encontrado1 == 0) {
                        JOptionPane.showMessageDialog(null, "Lo sentimos el cliente que buscas no existe");
                    }
                    break;
                case 6:
                    String nom1 = JOptionPane.showInputDialog("Ingrese el nombre del empleado que quiere borrar..!");
                    for (int i = 0; i < Clientes.size(); i++) {

                        if (nom1.equals(Clientes.get(i).getNombre())) {
                            Clientes.remove(i);
                            JOptionPane.showMessageDialog(null, "EMPLEADO ELIMINADO");
                        }

                    }

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "USTED SEA SALIDO DEL MENU PRINCIPAL \n"
                            + "¨GRACIAS¨");

            }
        } while (opc != 7);
    }
    }
    

