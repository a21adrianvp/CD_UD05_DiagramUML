public class Main {
    public static void main(String[] args) {

        //TODO: Crear los siguientes pasos para comprobar el funcionamiento del programa 
        // Crear una veterinaria
        Veterinaria veterinaria1 = new Veterinaria();
        // Crear dos clientes
        Cliente cliente1 = new Cliente("juan", "Santiago de Compostela", "666666666");
        Cliente cliente2 = new Cliente("pablo", "Negreira", "777777777");
        

        // Agregar clientes a la veterinaria
        veterinaria1.agregarCliente(cliente1);
        veterinaria1.agregarCliente(cliente2);
        // Crear dos animales
        Animal animal1 = new Animal("Paco", "Simio", "Mono", cliente1);
        Animal animal2 = new Animal("Cesar", "Simio", "Gorila", cliente2);


        // Agregar animales a la veterinaria
        veterinaria1.agregarAnimal(animal1);
        veterinaria1.agregarAnimal(animal2);

        //Crear un veterinario 
        Veterinario veterinario1 = new Veterinario("David", "Quiropractico de simios");
        // Crear una consulta
        Consulta consulta1 = new Consulta("22/04/2024", "Dolor de espalda", "Lumbalgia", "Masaje y reposo", veterinario1);

        // Asignar la consulta a un animal
        animal1.agregarConsulta(consulta1);
        //Imprimir todas las consultas de los animales de la clínica 
        veterinaria1.imprimirConsultas();
    }

}