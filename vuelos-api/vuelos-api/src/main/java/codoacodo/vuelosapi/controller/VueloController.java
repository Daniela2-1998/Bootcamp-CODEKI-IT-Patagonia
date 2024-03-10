package codoacodo.vuelosapi.controller;

import codoacodo.vuelosapi.modelo.Vuelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import codoacodo.vuelosapi.servicio.VueloService;

import java.util.List;

@RestController
@RequestMapping("/vuelos")
public class VueloController {

    //Vuelo vuelo1 = new Vuelo();

    @Autowired
    VueloService vueloService;


    @GetMapping("/saludar")
    public String saludar(){
        return vueloService.sayHello();
    }

    /*
    @GetMapping("/vuelo")
    public Vuelo getFlight(){

        return vueloService.getFlight(0);
    }

     */

    @GetMapping("/todos")
    public List<Vuelo> getAllFlights(){
        return vueloService.getAllFlights();
    }

    @PostMapping("/crear")
    public void addFlight(@RequestBody Vuelo vuelo){
        vueloService.addFlight(vuelo);
    }

    @PutMapping("/actualizar")
    public void updateFlight(@RequestBody Vuelo vuelo){
       vueloService.updateFlight(vuelo);
    }

    /*@GetMapping("/{id}")
    public Vuelo findFlightById(@RequestParam (name = "id") Long id){
        Long id = 1L;

        Vuelo vueloEncontrado = vueloService.buscarVueloPorId(id);
        return vueloEncontrado;


        return vueloService.buscarVueloPorId(id);

    }

     */
    @GetMapping("/{id}")
    public Vuelo findFlightById(@PathVariable Long id){
        return vueloService.buscarVueloPorId(id);

    }

    @DeleteMapping("/eliminar/{id}")
    public void deleteFlight(@PathVariable Long id){
        vueloService.borrarVueloPorId(id);
    }

    /*
    @GetMapping("/vuelo")
    public Vuelo vuelo(){
        return vuelo1;
    }

     */
}
