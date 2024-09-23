package cliente;

import java.util.ArrayList;
import java.util.List;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import codigosDeError.ErrorClienteDAOXML_Exception;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class ClienteDAOXML implements ClienteDAOI {

    private final String RUTA = "src\\baseXML\\cliente.xml";
    private static Document docBuild;
    private static File fichero;

    public ClienteDAOXML() {
        try {
            fichero = new File(RUTA);
            DocumentBuilder docBuilder = (DocumentBuilderFactory.newInstance()).newDocumentBuilder();
            if (fichero.exists()) {
                docBuild = docBuilder.parse(fichero);
            } else {
                docBuild = docBuilder.newDocument();
                Element rootElement = docBuild.createElement("clientes");
                docBuild.appendChild(rootElement);
            }
        } catch (Exception e) {
            throw new ErrorClienteDAOXML_Exception("Error en constructor:" + e.getMessage());
        }
    }

    public Cliente buscar(int identificador) {
        try {
            NodeList clientes = docBuild.getElementsByTagName("cliente");
            for (int i = 0; i < clientes.getLength(); i++) {
                Element cliente = (Element) clientes.item(i);
                int codigo;
                if ((codigo = Integer.parseInt(cliente.getElementsByTagName("codigo").item(0).getTextContent())) == identificador) {
                    return new Cliente(codigo,
                            cliente.getElementsByTagName("nombre").item(0).getTextContent(),
                            cliente.getElementsByTagName("apellidos").item(0).getTextContent(),
                            cliente.getElementsByTagName("dni").item(0).getTextContent(),
                            cliente.getElementsByTagName("direccion").item(0).getTextContent()
                    );
                }
            }
            return null;
        } catch (Exception e) {
            throw new ErrorClienteDAOXML_Exception("Error en busqueda por id:" + e.getMessage());
        }
    }

    public Cliente buscar(Cliente c) {
        try {
            NodeList clientes = docBuild.getElementsByTagName("cliente");
            for (int i = 0; i < clientes.getLength(); i++) {
                Element cliente = (Element) clientes.item(i);
                String dni;
                if ((dni = cliente.getElementsByTagName("dni").item(0).getTextContent()).equals(c.getDni())) {
                    return new Cliente(Integer.parseInt(cliente.getElementsByTagName("codigo").item(0).getTextContent()),
                            cliente.getElementsByTagName("nombre").item(0).getTextContent(),
                            cliente.getElementsByTagName("apellidos").item(0).getTextContent(),
                            dni,
                            cliente.getElementsByTagName("direccion").item(0).getTextContent()
                    );
                }
            }
            return null;
        } catch (Exception e) {
            throw new ErrorClienteDAOXML_Exception("Error de busqueda cliente:" + e.getMessage());
        }
    }

    public boolean guardar(Cliente c) {
        try {
            if (validarDni(c.getDni())) {
                if (buscar(c) == null && buscar(c.getCodigo()) == null && buscar(c.getCodigo()) == null) {
                    // Creamos cliente
                    Element clienteElement = docBuild.createElement("cliente");
                    docBuild.getDocumentElement().appendChild(clienteElement);

                    // Añadimos subelementos
                    Element codigoElement = docBuild.createElement("codigo");
                    codigoElement.appendChild(docBuild.createTextNode(String.valueOf(c.getCodigo())));
                    clienteElement.appendChild(codigoElement);

                    Element nombreElement = docBuild.createElement("nombre");
                    nombreElement.appendChild(docBuild.createTextNode(c.getNombre()));
                    clienteElement.appendChild(nombreElement);

                    Element apellidosElement = docBuild.createElement("apellidos");
                    apellidosElement.appendChild(docBuild.createTextNode(c.getApellidos()));
                    clienteElement.appendChild(apellidosElement);

                    Element dniElement = docBuild.createElement("dni");
                    dniElement.appendChild(docBuild.createTextNode(c.getDni()));
                    clienteElement.appendChild(dniElement);

                    Element direccionElement = docBuild.createElement("direccion");
                    direccionElement.appendChild(docBuild.createTextNode(c.getDireccion()));
                    clienteElement.appendChild(direccionElement);

                    escribirFichero();
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            throw new ErrorClienteDAOXML_Exception("Error en guardar:" + e.getMessage());
        }
    }

    public boolean borrar(Cliente c) {
        try {
            NodeList clientes = docBuild.getElementsByTagName("cliente");
            for (int i = 0; i < clientes.getLength(); i++) {
                Element cliente = (Element) clientes.item(i);
                if (Integer.parseInt(cliente.getElementsByTagName("codigo").item(0).getTextContent()) == c.getCodigo()) {
                    cliente.getParentNode().removeChild(cliente);
                    escribirFichero();
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            throw new ErrorClienteDAOXML_Exception("Error en borrar:" + e.getMessage());
        }
    }

    public boolean modificar(Cliente c) {
        try {
            NodeList clientes = docBuild.getElementsByTagName("cliente");
            if (validarDni(c.getDni())) {
                for (int i = 0; i < clientes.getLength(); i++) {
                    Element cliente = (Element) clientes.item(i);
                    if (Integer.parseInt(cliente.getElementsByTagName("codigo").item(0).getTextContent()) == c.getCodigo()) {
                        cliente.getElementsByTagName("nombre").item(0).setTextContent(c.getNombre());
                        cliente.getElementsByTagName("apellidos").item(0).setTextContent(c.getApellidos());
                        cliente.getElementsByTagName("dni").item(0).setTextContent(c.getDni());
                        cliente.getElementsByTagName("direccion").item(0).setTextContent(c.getDireccion());
                        escribirFichero();
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            throw new ErrorClienteDAOXML_Exception("Error en modificar:" + e.getMessage());
        }
    }

    public List<Cliente> obtenerListado() {
        try {
            List<Cliente> clientesList = new ArrayList<>();
            NodeList clientes = docBuild.getElementsByTagName("cliente");
            for (int i = 0; i < clientes.getLength(); i++) {
                Element cliente = (Element) clientes.item(i);
                clientesList.add(new Cliente(Integer.parseInt(cliente.getElementsByTagName("codigo").item(0).getTextContent()),
                        cliente.getElementsByTagName("nombre").item(0).getTextContent(),
                        cliente.getElementsByTagName("apellidos").item(0).getTextContent(),
                        cliente.getElementsByTagName("dni").item(0).getTextContent(),
                        cliente.getElementsByTagName("direccion").item(0).getTextContent()
                ));
            }
            return clientesList;
        } catch (Exception e) {
            throw new ErrorClienteDAOXML_Exception("Error al obtener listado:" + e.getMessage());
        }
    }

    private static void escribirFichero() {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(docBuild);
            StreamResult result = new StreamResult(fichero);
            transformer.transform(source, result);
        } catch (Exception e) {
            throw new ErrorClienteDAOXML_Exception("Error al escribir fichero:" + e.getMessage());
        }
    }

    @Override
    public boolean validarDni(String dni) {
        //Validar dni java
        try {
            String numero;
            char letra;
            int numeroDni;
            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            if (dni != null && dni.length() == 9) {
                numero = dni.substring(0, 8);
                letra = dni.toUpperCase().charAt(8);
                numeroDni = Integer.parseInt(numero);
                return letra == letras.charAt(numeroDni % 23);
            }
            return false;
        } catch (Exception e) {
            throw new ErrorClienteDAOXML_Exception("Error dni no valido:" + e.getMessage());
        }
    }
}
