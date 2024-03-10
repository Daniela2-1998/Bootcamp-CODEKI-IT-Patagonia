package codoacodo.vuelosapi.servicio;

import codoacodo.vuelosapi.modelo.Vuelo;
import codoacodo.vuelosapi.repository.VueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VueloService {

    @Autowired
    VueloRepository vueloRepository;

    private List<Vuelo> flightList = new ArrayList<>();
   /* Vuelo flight1 = new Vuelo(1L, "Puerto Madryn", "Cordoba", "03-03-2024", "03-03-2024", 2000.00, "mensual");
    Vuelo flight2 = new Vuelo(2L, "Cordoba", "Puerto Madryn", "25-02-2024", "04-03-2024", 2000.00, "diaria");
    Vuelo flight3 = new Vuelo(3L, "Madryn Puerto", "Cordoba", "26-02-2024", "05-03-2024", 2000.00, "semanal");
*/

    public String sayHello(){
        return "hola mundo!";
    }

    public void createFlight(){
        /*flightList.add(flight1);
        flightList.add(flight2);
        flightList.add(flight3);

         */
    }

    public void addFlight(Vuelo vuelo){
        /*createFlight();
        flightList.add(new Vuelo(4L, "Puerto Piramides", "Tucuman", "26-02-2024", "05-03-2024", 2000.00, "semanal"));
   */
        vueloRepository.save(vuelo);
    }

  /*  public Vuelo getFlight(){
        createFlight();
        return flightList.get(0);
    }

   */

    public List<Vuelo> getAllFlights(){
        return vueloRepository.findAll();
    }

    public Vuelo buscarVueloPorId(Long id) {
        /*createFlight();
        //flightList.streams().forEach();
        for (int i = 0; i < flightList.size(); i++) {
            if (flightList.get(i).getId() == id) {
                return flightList.get(i);
            }
        }
        return null;

         */
        // para no usar optional
        return vueloRepository.findById(id).orElse(null);
    }

    public void borrarVueloPorId(Long id) {
        //Vuelo vueloEncontrado = buscarVueloPorId(id);
        //flightList.remove(vueloRepository.findById(id).orElse(null));
        vueloRepository.deleteById(id);
    }

    public Vuelo updateFlight(Vuelo vuelo) {
        vueloRepository.save(vuelo);
        return vueloRepository.findById(vuelo.getId()).orElse(null);
    }
}
