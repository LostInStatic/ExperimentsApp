package pl.czarczeslaw.experimentsapp.component;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import pl.czarczeslaw.experimentsapp.mapper.ProductMapper;
import pl.czarczeslaw.experimentsapp.mapper.TrialMapper;
import pl.czarczeslaw.experimentsapp.model.Product;
import pl.czarczeslaw.experimentsapp.model.Rooms;
import pl.czarczeslaw.experimentsapp.model.Trial;
import pl.czarczeslaw.experimentsapp.model.dto.CreateProductDto;
import pl.czarczeslaw.experimentsapp.model.dto.CreateTrialDto;
import pl.czarczeslaw.experimentsapp.repository.ProductRepository;
import pl.czarczeslaw.experimentsapp.repository.TrialReposiotory;

import java.util.Arrays;
import java.util.List;

@Component
public class DataInit {

    @Bean
    public CommandLineRunner onApplicationEvent(ProductRepository productRepository, TrialReposiotory trialReposiotory, ProductMapper productMapper, TrialMapper trialMapper) {
        return args -> {
            Product balloon = productMapper.createProductFromDto(new CreateProductDto(1L, "balloon", Rooms.OFFICE));
            Product petBottle = productMapper.createProductFromDto(new CreateProductDto(2L, "pet-bottle", Rooms.KITCHEN));
            Product scissors = productMapper.createProductFromDto(new CreateProductDto(3L, "scissors", Rooms.OFFICE));
            Product paper = productMapper.createProductFromDto(new CreateProductDto(4L, "paper", Rooms.OFFICE));
            Product water = productMapper.createProductFromDto(new CreateProductDto(5L, "water", Rooms.BATHROOM));
            productRepository.saveAll(Arrays.asList(balloon, petBottle, scissors, paper, water));

            Trial trial1 = trialMapper.createTrialFromDto(new CreateTrialDto(1L, "Megafon",
                    "Zwiń kartkę w „lejek”. Wielkość powstałego otworu nie jest szczególnie istotna – najważniejsze, aby można było w miarę wygodnie przystawić do niego usta\n" +
                            "Przystaw usta do mniejszego otworu, który powstał przy zrobieniu „lejka”\n" +
                            "Wydawaj rozmaite dźwięki. Raz z ustami przystawionymi do stworzonego megafonu, a raz obok niego\n" +
                            "Słuchaj, co się dzieje\n" +
                            "Spróbuj przyłożyć do megafonu inne źródła dźwięku (np. głośnik telefonu)"));
            Trial trial2 = trialMapper.createTrialFromDto(new CreateTrialDto(2L, "Siła bezwładności",
                    "Przetnij butelką na pół i ustaw dolną połowę na równej powierzchni\n" +
                            "Weź kartkę A4 i dwukrotnie złóż ją na poł\n" +
                            "Połóż złożoną kartkę na otworze powstałym dzięki rozcięciu butelki\n" +
                            "Połóż na kartce korek\n" +
                            "Powoli przesuń kartkę, aż spadnie z butelki\n" +
                            "Powtórz eksperyment, ale tym razem zamiast delikatnie przesuwać kartkę wyciągnij ją energicznym i szybkim ruchem"));
            Trial trial3 = trialMapper.createTrialFromDto(new CreateTrialDto(3L, "Elektrownia wodna",
                    "Zrób nożyczkami 3 małe dziurki na różnych wysokościach butelki\n" +
                            "Zatkaj palcami dziurki i nalej do pełna wody\n" +
                            "Odetkaj dziurki\n" +
                            "Obserwuj, co się dzieje"));
            Trial trial4 = trialMapper.createTrialFromDto(new CreateTrialDto(4L, "Wyrzutnia rakiet",
                    "Wytnij z kartki kwadrat o wymiarach zbliżonych do 5 cm x 5 cm\n" +
                            "Wycięty kwadrat skręć w rulon i umieść w otworze butelki, tak aby część wystawała, a część była w środku. To będzie nasza wyrzutnia\n" +
                            "Wytnij z kartki prostokąt o wymiarach zbliżonych do 7 cm x 12 cm\n" +
                            "Wycięty prostokąt skręć w rulon, a u jego góry zrób zamknięty dziubek. Postaraj się, aby zrolowana kartka była jak najszczelniej skręcona i nie przepuszczała powietrza zarówno u góry, jak i po bokach. Zwróć uwagę na to, aby szerokość dolnego otworu była jedynie nieznacznie większa od szerokości kartki tkwiącej w butelce. To będzie nasza rakieta\n" +
                            "Nałóż rakietę na wyrzutnię\n" +
                            "Energicznym i szybkim ruchem naciśnij jak najmocniej na butelkę\n" +
                            "Obserwuj, co się dzieje\n" +
                            "Eksperymentuj z rozmiarami, kształtem i typem pocisku"));
            Trial trial5 = trialMapper.createTrialFromDto(new CreateTrialDto(5L, "Budowniczy piramid",
                    "Do jednej z butelek (o kwadratowych ściankach!) nalej do pełna wody - to będzie nasz kamienny blok\n" +
                            "Połóż butelkę z wodą na płaskiej powierzchni i spróbuj ją przesunąć\n" +
                            "Pozostałe butelki (o zaokrąglonych ściankach!) połóż na płaskiej powierzchni równolegle do siebie zachowując między nimi odstęp około 5 cm – to będą nasze bale transportowe\n" +
                            "Połóż butelkę napełnioną wodą na pozostałych i spróbuj ją przesunąć\n" +
                            "Porównaj obie sytuacje"));

            List<Product> list1 = trial1.getProduct();
            list1.add(paper);
            trial1.setProduct(list1);

            List<Product> list2 = trial2.getProduct();
            list2.addAll(Arrays.asList(petBottle, paper, scissors));
            trial2.setProduct(list2);

            List<Product> list3 = trial3.getProduct();
            list3.addAll(Arrays.asList(petBottle, scissors, water));
            trial3.setProduct(list3);

            List<Product> list4 = trial4.getProduct();
            list4.addAll(Arrays.asList(paper, petBottle, scissors));
            trial4.setProduct(list4);

            List<Product> list5 = trial5.getProduct();
            list5.addAll(Arrays.asList(petBottle, petBottle, petBottle, petBottle, water));
            trial5.setProduct(list5);

            trialReposiotory.saveAll(Arrays.asList(trial1, trial2, trial3, trial4, trial5));
        };
    }
}
