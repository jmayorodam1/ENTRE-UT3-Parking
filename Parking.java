/**
 * La clase representa a un parking de una ciudad europea
 * que dispone de dos tarifas de aparcamiento para los clientes
 * que lo usen: la tarifa regular (que incluye una tarifa plana para
 * entradas "tempranas") y la tarifa comercial para clientes que trabajan
 * cerca del parking, aparcan un n� elevado de horas y se benefician de esta 
 * tarifa m�s econ�mica
 * (leer enunciado)
 * Javier Mayor
 */
public class Parking

{
    private String nombreParking;
    private String Regular;
    private String Comercial;
    private int HoraLlegada;
    private int HoraSalida;
    private int NumeroCliente;
    private String Tarifa;
    private double Importe;
    private int dia;
    private int horaTotal;
    private double tarifa;
    private int numeroTarifaRegular;
    private int numeroTarifaComercial;
    private double tarifaTotal;
    
    /**
     * Inicializa el parking con el nombre indicada por el par�metro.
     * El resto de atributos se inicializan a 0 
     */
    public Parking() {

        HoraLlegada = 0;
        HoraSalida = 0;
        NumeroCliente = 0;
        Tarifa = "";
        Importe = 0;
        nombreParking = "";

    }
    /**
     * accesor para el nombre del parking
     *  
     */
    public String getNombreParking() {
        return nombreParking;

    }

    /**
     * mutador para el nombre del parking
     *  
     */
    public void nombreParking (String queNombreParking) {
        nombreParking = queNombreParking;

    }

    /**
     * mutador de entrada
     *
     * 
     */
    public void entrada(int queHoraLlegada)
    {
        HoraLlegada = queHoraLlegada;

    }

    /**
     * Mutador de salida

     */
    public void salida(int queHoraSalida)
    {
        HoraSalida = queHoraSalida; 

    }

    /**
     * Si es comercial o Regular
     *

     */
    public void Tarifa(String tipoTarifa){
        Tarifa = tipoTarifa;
        Regular = "R";
        Comercial = "C";

    }

    /**
     * Dia de entrada
     *

     */
    public void dia(int queDia)
    {
        dia = queDia;

    }

    /**
     * 
     *Tiempo en el parking
     * 
     */
    public void hora()
    {
        horaTotal = HoraSalida - HoraLlegada;

    }

    /**
     *  Recibe cuatro par�metros que supondremos correctos:
     *    tipoTarifa - un car�cter 'R' o 'C'
     *    entrada - hora de entrada al parking
     *    salida � hora de salida del parking
     *    dia � n� de d�a de la semana (un valor entre 1 y 7)
     *    
     *    A partir de estos par�metros el m�todo debe calcular el importe
     *    a pagar por el cliente y mostrarlo en pantalla 
     *    y  actualizar� adecuadamente el resto de atributos
     *    del parking para poder mostrar posteriormente (en otro m�todo) las estad�sticas
     *   
     *    Por simplicidad consideraremos que un cliente entra y sale en un mismo d�a
     *    
     *    (leer enunciado del ejercicio)
     */
    public void facturarCliente( char tipoTarifa, int queHoraEntrada, int queHoraSalida, int dia, int Hora) {
        if (tipoTarifa = 'R') { 
            if (Hora < 11){
                tarifa = 2 + ((3*Hora)*2);

            }
            if (Hora > 11){
                tarifa = 2+ ((5*Hora)*2);

            }

            if (tipoTarifa = 'C'){
                if (Hora <= 3){
                    tarifa = Hora *5;

                }
                if (Hora > 3){
                    tarifa = (3*5) + (Hora*2) * 3; 

                }

            }

        
       
        }
       
        

    }

    /**
    * Muestra en pantalla https://github.com/jmayorodam1/ENTRE-UT3-Parking.gitlas estad�sticcas sobre el parking  
    *   
    * (leer enunciado)
     */
    private void printEstad�sticas()
    {
        System.out.println ("Importe total entre todos los clientes" + tarifaTotal  +  
                "\nN� clientes tarifa regular" + numeroTarifaRegular  + 
                "\nN�clientes tarifa comercial" + numeroTarifaComercial + 
                "\nCliente tarifa COMERCIAL con factura maxima fue el" + "y pago");
        
    }


    /**
     * 
     *
     * Calcula y devuelve un String que representa el nombre del d�a
     *  en el que m�s clientes han utilizado el parking - "S�BADO"   "DOMINGO" o  "LUNES"
     */
    public String diaMayorNumeroClientes(){
        
    }

}
