CREATE TABLE IF NOT EXISTS product (
    id int NOT NULL AUTO_INCREMENT,
    name varchar(24),
    rooms varchar(24),
    PRIMARY KEY (id)
);

INSERT INTO product (name, rooms) VALUES
('Balon', 'KITCHEN'),
('Butelka', 'KITCHEN'),
('Nożyczki', 'KITCHEN'),
('Papier', 'KITCHEN'),
('Woda', 'KITCHEN');

CREATE TABLE IF NOT EXISTS trial (
    id int NOT NULL AUTO_INCREMENT,
    name varchar(50),
    description varchar(3000),
	type_id int,
	when_created datetime,
    PRIMARY KEY (id)
);

INSERT INTO trial (name, when_created, description) VALUES
('Balon ochronny', CURRENT_TIMESTAMP,
 '
### Balon ochronny

#### Rzeczy
- balon

#### Wstęp
Zamknij pięść w balonie

#### Instrukcja
1. Spróbuj naciągnąć gumę balonową, tak aby całkowicie pokryła Twoją pięść
2. Całą! Całą, a nie tylko jakiś nędzny malutki pasek…
3. Pogłówkuj i popróbuj jeszcze trochę
4. Całą! Całą, całą, całą!
5. Całą!
6. No dobra, dobra – czytaj spokojnie dalej
7. Nadmuchaj jak największy balon, ale nie zawiązuj węzełka!
8. Oprzyj łokieć na równej powierzchni i wystaw w górę zaciśniętą pięść
9. Oprzyj górną część balona na pięści przytrzymując go w okolicach węzełka
10. Przyciśnij mocno balon do pięści, jednocześnie puszczając węzełek i pozwalając powietrzu wydostać się na zewnątrz

#### Wyjaśnienie
Rozciągnięcie balonowej gumy wymaga siły. Najczęściej rozciągamy go poprzez wtłoczenie do środka powietrza. O ile nie zawiążemy jednak węzełka balon spróbuje powrócić do swojej wcześniejszej nienadmuchanej formy. Gdy przyciśniemy pięść do balona, z którego ucieka powietrze, ten przy powracaniu do pierwotnego stanu zaciśnie się na naszej ręce.

Eksperyment wymaga odrobiny wprawy, ale po krótkich ćwiczeniach będziesz w stanie zaciskać gumę balonową także na innych powierzchniach i stworzyć np. kolorowe etui na telefon.

 '),
 ('Balon w butelce', CURRENT_TIMESTAMP,
  '
  ### Balon w butelce

##### Rzeczy
- butelka
- balon

##### Wstęp
Z serii zadanie proste, a niemożliwe, czyli nadmuchiwanie balona.

##### Instrukcja
1. Nadmuchaj jak największy balon w środku butelki
2. Obserwuj, co się dzieje

##### Wyjaśnienie
Powietrze jest mało ściśliwe, a na dodatek nie ma dokąd uciec. Stąd problem z nadmuchaniem wielkiego balona.
  '),
   ('Bębenek',CURRENT_TIMESTAMP,
  '
  ### Bębenek

#### Rzeczy
- balon
- butelka

#### Wstęp
Wykonanie własnego instrumentu może być prostsze niż myślisz

#### Instrukcja
1. Nałóż balon na wylot butelki, tak aby powstała napięta membrana z gumy
2. W utworzoną membranę uderz, albo lekko ją naciągnij
3. Słuchaj, co się wydarza

#### Wyjaśnienie
Granie w kółko tej samej melodii może być lekko monotonne. Całe szczęście dźwięk ma wiele właściwości jak np. wysokość, częstotliwość, czy barwę, a my możliwość ich modyfikacji.

Spróbuj zmienić muzykę wydawaną przez instrument z naszego eksperymentu.  Jak będzie brzmieć przy butelce z innego materiału? Jak przy większej, bądź mniejszej? A może warto nalać do środka wody? Albo zrobić coś jeszcze innego? Możliwości, jak to w muzyce, jest nieskończoność.

  '),
     ('Budowniczy piramid',CURRENT_TIMESTAMP,
  '
  ### Budowniczy piramid

##### Rzeczy
- butelka x 4
- woda

##### Wstęp
Odrzućmy na chwilę zdobycze współczesnej techniki, aby wcielić się w budowniczego ze starożytnego Egiptu i zobaczyć jak możliwy był transport ciężkich kamiennych bloków, które posłużyły do budowy piramid.

##### Instrukcja
1. Do jednej z butelek (o kwadratowych ściankach!) nalej do pełna wody - to będzie nasz kamienny blok
2. Połóż butelkę z wodą na płaskiej powierzchni i spróbuj ją przesunąć
3. Pozostałe butelki (o zaokrąglonych ściankach!) połóż na płaskiej powierzchni równolegle do siebie zachowując między nimi odstęp około 5 cm – to będą nasze bale transportowe
4. Połóż butelkę napełnioną wodą na pozostałych i spróbuj ją przesunąć
5. Porównaj obie sytuacje

##### Wyjaśnienie
Gdyby Egipcjanie byli ograniczeni do prostego ciągnięcia kamiennych bloków zapewne nie udałoby im się zbudować piramid, ponieważ wymagałoby to zbyt dużo energii. W celu zmniejszenia oporu ruchu używali drewnianych bali podkładanych pod kamienne bloki. W wypadku pomocy walca, albo koła zmniejsza się tarcie, od którego zależy utrata energii podczas ruchu. Przy ich pomocy łatwo nawet 40-krotnie zmniejszyć siłę wymaganą do przesunięcia rzeczy i zbudować piramidę, bądź działając na odrobinę mniejszą skalę, przesunąć więcej butelek zapełnionych wodą i nie złapać zadyszki.

Historia transportu to nie tylko historia tego jak lepiej przemieszczać przedmioty, ale również historia wymiany idei, zmian społecznych i mobilności ludzkiej. Wszystko zaczęło się od koła, a dopiero później nastała era samochodów, rowerów, czy samolotów. Transport oraz to w jaki sposób się przemieszczamy i wymieniamy informacje wciąż pozostaje jednym z najistotniejszych czynników kształtujących świat.

  '),
     ('Dlaczego samoloty latają',CURRENT_TIMESTAMP,
  '
  ### Dlaczego samoloty latają

##### Rzeczy
- balon x 2

##### Wstęp
Aby zrozumieć jeden z najważniejszych mechanizmów umożliwiających lot wystarczą nam dwa balony.

##### Instrukcja
1. Nadmuchaj i zawiąż balony
2. Złap balony za ogonki i trzymaj przed sobą tak, aby odstęp między nimi wynosił około 5 centymetrów
3. Dmuchnij w przerwę między balonami
4. Obserwuj co się dzieje

##### Wyjaśnienie:
Mówiąc prosto, ale mniej konkretnie podczas dmuchania zmniejszamy ciśnienie w danym miejscu, a jako że większe ciśnienie naciska na niższe balony zbliżają się do siebie zamiast oddalać.

Mówiąc trochę trudniej, ale też trochę konkretniej

Kiedy dmuchamy tworzy się strumień powietrza. W takim strumieniu zwiększa się ciśnienie dynamiczne zależne od prędkości gazu. Dzieje się to jednak pewnym kosztem. Zgodnie z prawem Bernoulliego ciśnienie całkowite (będące sumą ciśnienia dynamicznego i statycznego) jest stałe w danej strudze gazu. Obniżone zostaje zatem ciśnienie statyczne w strumieniu, natomiast ciśnienie statyczne naokoło balonów nie ulega zmianie. Oznacza to, iż ciśnienie naokoło balonów jest wyższe od tego w strumieniu, a jako, że wyższe ciśnienie naciska na niższe balony zbliżają się do siebie.

Zjawisko, którego jesteśmy świadkiem tłumaczy działanie skrzydeł w samolocie. Kształt skrzydła sprawia, że u jego góry powietrze ma dłuższą drogę do przebycia, co powoduje jego przyspieszenie, a ostatecznie spadek ciśnienia. Ciśnienie u dołu skrzydła jest wyższe i naciska na nie dzięki czemu (oraz paru innym czynnikom!) samolot pchany jest do góry .
'),
   ('Domowy podsłuch',CURRENT_TIMESTAMP,
  '
  ### Domowy podsłuch

#### Rzeczy
- butelka

#### Wstęp
Wzmocnij dźwięk i usłysz, co dzieje się za ścianą

#### Instrukcja
1. Przyłóż butelkę (najlepiej szklaną!) otworem do ściany
2. Przyłóż ucho do dna butelki
3. Słuchaj, co się dzieje
4. Jeśli aktualnie nie ma żadnych hałasów poproś drugą osobę, aby postukała w ścianę, albo w inny sposób wytworzyła dźwięk.

#### Wyjaśnienie
Dźwięk lepiej rozchodzi się po ciałach stałych niż gazowych. Przykładając ucho do butelki pomijamy powietrze, co umożliwia sprawniejsze przemieszczenie dźwięku.

Prędkość rozchodzenia się dźwięku zależna jest m.in. od sztywności oraz gęstości danego materiału. Im większa sztywność tym cząsteczki są ze sobą mocniej związane i szybciej przekazują zaburzenia takie jak chociażby dźwięk. Im większa gęstość tym większa masa, a co za tym idzie przekazanie zaburzenia będzie trudniejsze.

Ciała stałe mają większą gęstość od powietrza, co utrudnia przekazanie dźwięku, ale jednocześnie większą sztywność, co z kolei usprawnia jego podróż. Większa sztywność nadrabia z nawiązka problemy sprawiane przez gęstość, dzięki czemu dźwięk znacznie szybciej przenosi się w ciałach stałych niż w gazach.
  '),
     ('Dziura w ręce',CURRENT_TIMESTAMP,
  '
  ### Dziura w ręce

##### Rzeczy
- kartka

##### Wstęp
Zrobienie dziury w swojej ręce za pomocą nożyczek jest stosunkowo prostą i mało przyjemną czynnością. Sprawa wygląda zupełnie inaczej, kiedy użyjemy do tego kartki.

##### Instrukcja
1. Zwiń kartkę w rulon
2. Przyłóż zrolowaną kartkę do prawego oka
3. Wybierz odległy punkt i wpatruj się w niego przez otwór w rulonie
4. Przyłóż dłoń do rulonu z lewej strony i przesuwaj ją powoli w przód i w tył
5. Przez cały czas miej otwarte oboje oczu!
6. Powtórz eksperyment dla lewego oka trzymając dłoń z prawej strony rulonu

##### Wyjaśnienie
Obrazy widziane przez jedno i drugie oko znacząco się różnią. To mózg skleja je w jedno i decyduje jaką rzeczywistość oglądamy ostatecznie. W przypadku naszego eksperymentu gramy z mózgiem, a ten lekko zmylony nie może się zdecydować, który obraz powinien pokazać i stąd lekko przerażający efekt.

Po co nam w takim razie dwoje oczu? Czy nie prościej byłoby przestać bawić się w gierki z umysłem i oglądać świat tylko jednym okiem? Niekoniecznie. Widzenie dwojgiem oczu umożliwia nam lepsze widzenie głębi, ocenę odległości między rzeczami, a także oglądanie filmu w technologii 3d. Co ciekawe jeśli mielibyśmy wybrać urodzenie się z jednym okiem bądź stracenie go w trakcie życia zdecydowanie lepsza jest druga opcja. Mózg potrafi na tyle wyćwiczyć się w przyjmowaniu bodźców od oczu, że nawet utrata jednego oka nie musi spowodować znacznej utraty widzenia głębi, choć z całą pewnością mocno ograniczy nasze pole widzenie. Czemu, więc nie mieć trzech, czterech, albo nawet pięciu gałek ocznych? No właśnie – czemu?
'),
   ('Dziura większa od przedmiotu',CURRENT_TIMESTAMP,
  '
    ### Dziura większa od przedmiotu

#### Rzeczy
- kartka
- nożyczki

#### Wstęp
Zrobić dziurę w kartce jest rzeczą banalną, ale jak zrobić w niej dziurę przez którą można przejść?

#### Instrukcja
1. Weź kartę i przygotuj nożyczki
2. Wytnij w kartce dziurę tak wielką, aby człowiek mógł przez nią przejść
3. Kartka nie może być przy tym przerwana, bądź sklejona, ale jeśli chcesz możesz odciąć jej fragmenty
4. Pomyśl, potnij, popróbuj
5. UWAGA SPOILER I ROZWIĄZANIE
6. Wytnij z kartki kształt ślimaka, zwany również spiralą – im cieńszy będzie wycinany pasek tym większą dziurę później stworzysz
7. Przetnij powstałą spiralę wzdłuż środka powstałego paska. Nie rozcinaj początku, ani końca spirali!
8. Przechodź śmiało!
9. Psst – istnieją jeszcze przynajmniej dwa sposoby na rozwiązanie tej łamigłówki

#### Wyjaśnienie
Kiedy spojrzymy na kartkę A4 szybko zauważymy, że jesteśmy od niej dużo więksi, a zmieszczenie całej osoby w środku wydaje się cokolwiek absurdalną ideą. Kartka skrywa w sobie jednak nieskończoność kształtów możliwych do wycięcia, a pocięta na paski o grubości 1 mm utworzyłaby linię o długości ponad 0,5 km!

Nie tylko kartka przekracza samą siebie. Wnętrze człowieka również skrywa rzeczy przewyższające naszą wysokość. Ot choćby takie jelito po rozciągnięciu osiąga długość 4-6 metrów.
  '),
     ('Dziurawa butelka',CURRENT_TIMESTAMP,
  '
  ### Dziurawa butelka

##### Rzeczy
- woda
- butelka
- nożyczki

##### Wstęp
Jak przenieść wodę w dziurawej butelce?

##### Instrukcja
1. Nożyczkami zrób parę dziurek na bokach butelki, albo jak najbardziej okrągła dziurę na dnie butelki o średnicy maksymalnie 0,5 mm
2. Napełnij butelkę wodą
3. Obserwuj, co się dzieje
4. Ponownie napełnij butelkę wodą, po czym jak najszybciej zakręć korek
5. Obserwuj, co się dzieje

##### Wyjaśnienie
Wyższe ciśnienie naciska na niższe. Kiedy butelka jest zamknięta, ciśnienie wody jest słabsze niż ciśnienie atmosferyczne, które "przytrzymuje" wodę w butelce. Po odkręceniu korka ciśnienie atmosferyczne naciska od góry na wodę, przez co woda zaczyna wylatywać.
  '),
     ('Elektrownia wodna',CURRENT_TIMESTAMP,
  '
  ### Elektrownia wodna

##### Rzeczy
- butelka
- woda
- nożyczki

##### Wstęp
Elektrownie wodne mają coraz większy udział w energii wytwarzanej na świecie. Skąd bierze się jednak energia wody, którą zabieramy i pakujemy do naszych gniazdek i telefonów?

##### Instrukcja:
1. Zrób nożyczkami 3 małe dziurki na różnych wysokościach butelki
2. Zatkaj palcami dziurki i nalej do pełna wody
3. Odetkaj dziurki
4. Obserwuj, co się dzieje

##### Wyjaśnienie
Źródłem energii elektrycznej w elektrowniach wodnych jest energia potencjalna wody, zaś ilość tej energii wzrasta wraz z wysokością.  Możemy pokazać tę zależność za pomocą naszego eksperymentu. Im niżej położona dziurka, tym większy słup wody. Im większy słup wody, tym większa energia potencjalna. Im większa energia potencjalna tym większa siła, z którą pryska woda.

Bezcelowe pryskanie wodą nie jest prawdopodobnie najsensowniejszym, ani najciekawszym sposobem użycia energii, którą zgromadziła woda – masz może pomysł jak lepiej można wykorzystać energię wody z naszego eksperymentu?
  '),
     ('Instrument strunowy',CURRENT_TIMESTAMP,
  '
  ### Instrument strunowy

#### Rzeczy
- balon
- butelka
- nożyczki

#### Wstęp
Nie masz gitary? A masz 5 minut? To możesz mieć i gitarę.

#### Instrukcja
1. Rozciągnij balon, tak aby powstała z niego „struna”
2. Pograj na strunie, po czym przystaw jeden z jej końców do ucha i znowu zagraj
3. Rozetnij butelkę na pół. Do reszty doświadczenia przyda się tylko dolna połowa butelki
4. Przystaw napiętą balonową strunę do wyciętego otworu, tak aby opierała się na dwóch krawędziach ścian butelki.
5. Zagraj na strunie
6. Słuchaj, co się dzieje

#### Wyjaśnienie
Dźwięk powstaje w wyniku drgań. Drgać może praktycznie wszystko: słup powietrza, membrana, struna gitary, czy chociażby struny głosowe.

Drgająca struna tworzy falę dźwiękową, która przez powietrze dociera do naszego ucha. Może być jednak zbyt słaba, aby dźwięk był słyszalny. Jednym ze sposobów na jego zgłośnienie jest pudło rezonansowe, które pozwala na „zamknięcie” powietrze w skrzynce. Kolejne drgania struny powodują  pobudzanie powietrza w pudle. Dzięki utrudnionemu natychmiastowemu rozejściu się dźwięku jest on wzmacniany i muzyka gra głośniej.

Nasze pudło jest swoistą prowizorką, a stworzenie idealnego sprzętu jest niezwykle trudne. Jednak nawet przy działaniach na małą skalę można sprawdzić, jak kształt i materiał wpłyną na działanie pudła rezonansowego.
  '),
     ('Interaktywny model płuc',CURRENT_TIMESTAMP,
  '
  ### Interaktywny model płuc

#### Rzeczy
- balon x 2
- butelka
- nożyczki

#### Wstęp
Nie musisz rozcinać człowieka, aby zobaczyć jak działają płuca.

#### Instrukcja
1. Włóż balon do środka butelki jednocześnie naciągając go na jej wylot – to będzie nasze płuco
2. Odetnij dno butelki
3. Od drugiego balona odetnij wylot i około połowy dolnej części balonu
4. Górną część balonu naciągnij na otwór, który powstał po odcięciu dna butelki – to będzie nasza przepona
5. Delikatnie ponaciągaj membranę balonu z dołu butelki.
6. Obserwuj, co się dzieje

#### Wyjaśnienie
Ciągnięcie membrany (a właściwie przepony) obrazuje wdech powietrza do naszego organizmu. W środku butelki (klatki piersiowej) pojawia się wtedy więcej przestrzeni. Sytuację wykorzystuje powietrze, które momentalnie napełnia balonik (płuca). Kiedy rozluźniamy przeponę przestrzeń w klatce piersiowej zmniejsza się i powietrze z płuc wydychane jest na zewnątrz.

Przy oddychaniu odbywa się wymiana gazowa. Dostarczamy do organizmu tlen oraz pozbywamy się niepotrzebnych substancji - m.in. dwutlenku węgla.
  '),
     ('Megafon',CURRENT_TIMESTAMP,
  '
  ### Megafon

#### Rzeczy
- kartka

#### Wstęp
Wzmocnij moc swych strun głosowych!

#### Instrukcja
1. Zwiń kartkę w „lejek”. Wielkość powstałego otworu nie jest szczególnie istotna – najważniejsze, aby można było w miarę wygodnie przystawić do niego usta
2. Przystaw usta do mniejszego otworu, który powstał przy zrobieniu „lejka”
3. Wydawaj rozmaite dźwięki. Raz z ustami przystawionymi do stworzonego megafonu, a raz obok niego
4. Słuchaj, co się dzieje
5. Spróbuj przyłożyć do megafonu inne źródła dźwięku (np. głośnik telefonu)

#### Wytłumaczenie

Megafon nie tylko wzmacnia siłę dźwięku, ale wyznacza także kierunek, w którym będzie się rozchodził. Co ciekawe podczas przemieszczania dźwięku nie przemieszczają się cząsteczki, a jedynie informacja o ich zagęszczeniu. Zasięg stworzonego hałasu również ma swoje granice - wraz z odległością zmniejsza się natężenie dźwięku, czyli innymi słowy zmniejsza się jego głośność.

To na ile dźwięk napotykający przeszkodę odbije się, a na ile ruszy dalej związane jest z impedancją akustyczną, czyli oporem jaki dany ośrodek stawia rozchodzącym się w nim dźwiękom. Im większa różnica między oporami w stykających się ośrodkach tym większe odbicie. To dlatego dźwięk wydawany pod wodą jest dobrze słyszalny pod jej powierzchnią, ale dużo słabiej nad. Analogicznie dźwięk wydawany w powietrzu będzie dużo gorzej słyszalny pod powierzchnią wody, a dużo lepiej nad nią.

Używając megafonu zbliżamy opór strun głosowych do oporu powietrza, a dzięki mniejszej różnicy następuje mniejsze odbicie i dźwięk jest głośniejszy. Pojawia się przy tym zniekształcenie dźwięku, gdyż megafon lepiej przenosi dźwięki o wyższej częstotliwości.
  '),
     ('Naelektryzowany balon',CURRENT_TIMESTAMP,
  '
  ### Naelektryzowany balon

##### Rzeczy
- balon
- kartka

##### Wstęp
Czy można poruszyć przedmiotem nie wchodząc z nim w bezpośredni kontakt? Czyli jak naukowo wyjaśnić moc Jedi z filmu Gwiezdne Wojny.

##### Instrukcja
1. Podrzyj kartkę na jak najmniejsze kawałki
2. Nadmuchaj balon, zawiąż i potrzyj energicznie o włosy
3. Potartą stronę balonu zbliż do kawałków papieru
4. Obserwuj co się dzieje


##### Wyjaśnienie
Podczas pocierania balon elektryzuje się, czyli gromadzi nadmiar ładunków jednego znaku (dodatnich, bądź ujemnych). Kiedy zbliżamy go do kawałków papieru te wprawiane są w ruch. Dzieje się tak ponieważ naelektryzowany przedmiot odpycha ładunki tego samego znaku, a przyciąga przeciwnego. W tym wypadku różnica w naelektryzowaniu dotyczyła balonu i kartek jednak gdybyśmy to my byli odmiennie naelektryzowaniu moglibyśmy przesunąć przedmioty bez używania dodatkowego sprzętu. Kompletna kontrola nad ładunkami umożliwiłaby przyciąganie i odpychanie rzeczy niczym Jedi z filmu Gwiezdne Wojny, a nawet duszenie ludzi na odległość.
  '),
     ('Nieprzezroczysta woda',CURRENT_TIMESTAMP,
  '
  ### Nieprzezroczysta woda

##### Rzeczy
- woda
- butelka
- balon

##### Wstęp
Jak za pomocą wody sprawić, że przedmioty staną się niewidzialne?

##### Instrukcja
1. Przygotuj pustą butelkę wody
2. Postaw ją na balonie, tak aby żadna jego część nie wystawała poza butelkę
3. Powoli nalewaj wody do środka butelki
4. Obserwuj, co się dzieje

##### Wyjaśnienie
Obraz, który widzimy dochodzi do nas dzięki promieniom światła odbijającym się od różnych rzeczy. Kiedy butelka jest pusta światło odbija się od kartki/balona w taki sposób, że bez problemu dochodzi do naszego oka.  Przechodząc pomiędzy różnymi ośrodkami (jak np. woda i powietrze) światło ulega załamaniu, czyli zmienia swój kierunek, a więc obraz również pojawia się w innym miejscu. Poprzez dolanie wody do szklanki zmienimy ośrodek, przez który światło przechodzi, a tym samym zmienimy kąt jego odbicia i obraz nie trafia już do tego samego miejsca!
  '),
     ('Nurkująca kartka',CURRENT_TIMESTAMP,
  '
  ### Nurkująca kartka

#### Rzeczy
- woda
- papier
- butelka

#### Wstęp
Jak umieścić kartkę pod wodą i jej przy tym nie zmoczyć?

#### Instrukcja
1. Odetnij górną część butelki nad miejscem, w którym zaczyna się zwężać. Pamiętaj o pozostawieniu zakręconego korka!
2. Przetnij pozostałą część butelki w połowie i postaw jej dolną część na równej powierzchni.
Nalej do niej wody
3. Włóż kartkę do części butelki, która zamknięta jest korkiem
4. Trzymając pionowo część butelki z kartką powoli zanurz ją w wodzie
5. Obserwuj, co się dzieje
6. Powoli wyciągnij butelkę z papierem i dotknij kartki
7. Powtórz doświadczenia bez zakręconego korka

#### Wyjaśnienie
Górna część butelki mieści w sobie nie tylko kartkę, ale również powietrze. Kiedy zanurzamy ją pionowo powietrze nie ma jak się wydostać, a jego obecność uniemożliwia wodzie wejście do środka. Po odkręceniu korka, powietrze jest wypychane przez wodę, która wchodzi na jego miejsce.
  '),
     ('Odwrócony obraz',CURRENT_TIMESTAMP,
  '
  ### Odwrócony obraz

##### Rzeczy
- butelka
- nożyczki
- woda

##### Wstęp
Jak obrócić nożyczki bez poruszania ręką?

##### Instrukcja
1. Na poziomej powierzchni umieść pustą szklaną butelkę
2. Za butelką przytrzymaj rozwarte nożyczki, tak aby dobrze widzieć je przez szkło
3. Przytrzymując nożyczki nalej wody do butelki
4. Powolutku zbliżaj i oddalaj nożyczki od butelki
5. Obserwuj, co się dzieje

##### Wyjaśnienie
Zaokrąglona butelka napełniona wodą działa jak soczewka. To znaczy, że obraz, który przez nią zobaczymy może być pomniejszony, powiększony, czy nawet odwrócony. Zależy to od rodzaju soczewki oraz odległości w jakiej znajduje się przedmiot.
  '),
     ('Poruszenie wody',CURRENT_TIMESTAMP,
  '
  ### Poruszenie wody

##### Rzeczy
- balon
- woda

##### Wstęp
Kto panuje nad elektrycznością panuje też nad wodą. Zwłaszcza jak ma ze sobą balon.

##### Instrukcja
1. Nadmuchaj i zawiąż balon
2. Puść drobny strumień wody
3. Potrzyj energicznie balonem o włosy
4. Potartą stronę balona zbliż do strumienia wody
5. Obserwuj, co się dzieje

##### Wyjaśnienie
Podczas pocierania balon elektryzuje się, czyli gromadzi nadmiar ładunków jednego znaku (dodatnich, bądź ujemnych). Naelektryzowany przedmiot odpycha ładunki tego samego znaku, a przyciąga odmiennego.
  '),
     ('Poziomica',CURRENT_TIMESTAMP,
  '
  ### Poziomica


#### Rzeczy
- butelka
- woda

#### Wstęp
Zamiast szukać narzędzi, stwórz je samemu

#### Instrukcja
1. Napełnij butelkę wodą niemal do pełna, tak aby został jedynie malutki pęcherzyk powietrza
2. Połóż butelkę na powierzchni poziomej, a potem na powierzchni nierównej
3. Obserwuj jak zachowuje się pęcherzyk powietrza

#### Wyjaśnienie
Wykonana konstrukcja to poziomica – jedno z popularniejszych narzędzi umożliwiających wyznaczenie poziomości, lub pionowości. Bąbelek powietrze utrzymuje się w najwyższym możliwym punkcie butelki. Jeśli powierzchnia jest równa pojawi się na środku, a jeśli nie będzie uciekać na boki.
  '),
     ('Przebijanie balona',CURRENT_TIMESTAMP,
  '
  ### Przebijanie balona

##### Rzeczy
- balon
- nożyczki

##### Wstęp
Jak przebić balon tak, aby nie pękł?

##### Instrukcja
1. Nadmuchaj i zawiąż balon.
2. Delikatnie wbij nożyczki w ciemniejsze miejsce balonu tuż przy węzełku
3. Delikatnie wbij nożyczki w ciemniejsze miejsce po drugiej stronie balonu
4. Wbij nożyczki w boczną ściankę balonu
5. Obserwuj, co się dzieje

##### Wyjaśnienie
Niektóre miejsca w balonie są mniej naciągnięte, a na dodatek mają więcej gumy. Ciemniejsze miejsca w balonie to właśnie te gdzie guma będzie mniej napięta, dzięki czemu balon nie powinien pęknąć po wbiciu w nie ostrego przedmiotu. Co więcej guma zacisk się wokół zrobionej dziury, co do pewnego stopnia pozwala ją zneutralizować.

Właściwości gumy wykorzystuje się m.in. w formule 1. Bak z benzyną pokryty jest gumą (troszeńkę lepszą od tej balonowej) dzięki czemu wszelkie kraksy wiążą się z mniejszym ryzykiem.
  '),
     ('Przyrząd optyczny',CURRENT_TIMESTAMP,
  '
  ### Przyrząd optyczny


#### Rzeczy
- butelka
- woda

#### Wstęp
Skonstruuj własną lupę detektywie!

#### Instrukcja
1. Napełnij szklaną butelkę wodą
2. Poprzyglądaj się różnym przedmiotom patrząc przez butelkę – szczególną uwagę zwróć na napisy

#### Wyjaśnienie
Zaokrąglona butelka napełniona wodą działa jak soczewka. To znaczy, że obraz, który przez nią zobaczymy może być pomniejszony, powiększony, czy nawet odwrócony. Zależy to od rodzaju soczewki oraz odległości w jakiej znajduje się przedmiot.
  '),
     ('Ściśliwość wody',CURRENT_TIMESTAMP,
  '
  ### Ściśliwość wody

##### Rzeczy
- woda
- butelka x2

##### Wstęp
Czy masz tyle siły, aby ścisnąć powietrze? Albo wodę?

##### Instrukcja
1. Napełnij jedną z butelek wodą
2. Napełnij drugą butelkę powietrzem
3. Porządnie zakręć obie butelki
4. Naciśnij jak najmocniej na butelki i porównaj efekt

##### Wyjaśnienie
Różne substancje mają różną ściśliwość, czyli zdolność do zmiany objętości pod wpływem ciśnienia.
  '),
     ('Siła bezwładności',CURRENT_TIMESTAMP,
  '
  ### Siła bezwładności

#### Rzeczy
- butelka
- kartka
- nożyczki

### Wstęp
Jak bez zbijania naczyń wyciągnąć obrus spod suto zastawionego stołu?

#### Instrukcja
1. Przetnij butelką na pół i ustaw dolną połowę na równej powierzchni
2. Weź kartkę A4 i dwukrotnie złóż ją na poł
3. Połóż złożoną kartkę na otworze powstałym dzięki rozcięciu butelki
4. Połóż na kartce korek
5. Powoli przesuń kartkę, aż spadnie z butelki
6. Powtórz eksperyment, ale tym razem zamiast delikatnie przesuwać kartkę wyciągnij ją energicznym i szybkim ruchem

#### Wyjaśnienie
Wedle zasady bezwładności, ciało chce zachować swój stan ruchu - jeśli znajduje się w stanie spoczynku, to pragnie w nim pozostać. Dla korka wygodniejsza jest pozostanie na kartce, kiedy wyciągamy ją powolnym ruchem, oraz pozostanie w miejscu, w którym była wcześniej kartka, jeśli wyciągniemy ją w energiczny sposób. Przy odrobinie wprawy możesz powtórzyć doświadczenie wyciągając obrus spod zastawionego stołu.
  '),
   ('Siła ciśnienia',CURRENT_TIMESTAMP,
  '
  ### Siła ciśnienia

##### Rzeczy
- kartka
- woda
- butelka

##### Wstęp
Grawitacja trzyma nas przy ziemi, pomaga jabłkom spadać i wydaje się dość potężna. Mimo tego wkładając odrobinę wysiłku możemy odnieść nad nią osobiste zwycięstwo.

##### Instrukcja
1. Napełnij szklaną butelkę wodą (im mniejsza butelka tym lepiej)
2. Przyłóż kartkę do otworu butelki (kartka powinna być jak najgrubsza i niewiele większa od otworu butelki)
3. Delikatnie przekręć butelkę tak, aby jej otwór znalazł się u dołu jednocześnie przytrzymując kartkę dłonią
4. Przestań przytrzymywać kartkę i cofnij dłoń
5. Obserwuj, co się dzieje

##### Wyjaśnienie
Po przekręceniu butelki wydostaje się z niej odrobina wody. Ilość powietrza w butelce pozostaje taka sama, ale dzięki mniejszej ilości wody zajmuje większą przestrzeń. W związku z tą samą ilością gazu, ale większą ilością miejsca ciśnienie powietrza w butelce ulega zmniejszeniu, podczas gdy ciśnienie na zewnątrz pozostaje takie samo. Jako, że wyższe ciśnienie naciska na niższe kartka jest dociskana do butelki.
  '),
     ('Spadanie stykających się ciał',CURRENT_TIMESTAMP,
  '
  ### Spadanie stykających się ciał

##### Rzeczy
- kartka
- butelka
- woda

##### Wstęp
Co będzie spadać szybciej – kartka umieszczona pod butelką, czy nad?

##### Instrukcja
1. Napełnij butelkę wodą
2. Podnieś butelkę jak najwyżej, umieść pod butelkę kartkę, po czym puść jednocześnie obie rzeczy
3. Obserwuj, co się dzieje
4. Podnieś butelkę jak najwyżej, połóż kartkę na butelce, po czym puść jednocześnie obie rzeczy
5. Obserwuj, co się dzieje
6. Powtórz doświadczenie z pustą butelką wody, oraz kartką złożoną do 1/8 swojej powierzchni, czyli trzykrotnie na pół
7. Eksperymentuj do woli z rozmaitymi parami przedmiotów

##### Wyjaśnienie
Prędkość spadania uzależniona jest od oporu powietrza. W wypadku chwilowego łączenia przedmiotów, to który spadnie pierwszy zależy od ich wzajemnego położenia oraz oporu powietrza jaki na nie działa.
  '),
     ('Spadanie',CURRENT_TIMESTAMP,
  '
  ### Spadanie

##### Rzeczy
- kartka x 2

##### Wstęp
Z dużej wysokości zrzucamy średniej wielkości słonia i małą kartkę. Obie rzeczy spadają na ziemię w tym samym momencie. Niemożliwe? A jednak!

##### Instrukcja
1. Zgnieć jedną kartkę w kulkę
2. Podnieś obie kartki na jednakową wysokość i zastanów się, która z nich spadnie pierwsza
3. Upuść kartki w tym samym momencie
4. Obserwuj, co się stanie

##### Wyjaśnienie
Aby zrozumieć dlaczego zgnieciona kartka spadła pierwsza musimy wpierw odpowiedzieć na pytanie dlaczego rzeczy spadają. Wbrew obiegowej opinii nie zależy to od ich masy, lecz od oporu powietrza. Zgnieciona kartka ma mniejszą powierzchnią od rozprostowanej, przez co powietrze styka się z nią na mniejszej powierzchni, a co za tym idzie siła jego oporu również jest mniejsza.

Co w takim razie spadłoby pierwsze - słoń, czy kartka? W typowych ziemskich warunkach byłby to oczywiście słoń. Jednak jeśli pozbylibyśmy się powietrza i stworzyli próżnię, czyli pozbylibyśmy się oporu powietrza słoń i kartka spadłyby dokładnie w tym samym momencie.

Jeżeli nie przemawia do Ciebie to doświadczenie wykonaj jego alternatywną wersję. Zamiast kartek użyj dwóch identycznych butelek. Jedną napełnij w całości wodą, a drugą jedynie w połowie.
  '),
     ('Wdmuchiwanie kulki do butelki',CURRENT_TIMESTAMP,
  '
  ### Wdmuchiwanie kulki do butelki

##### Rzeczy
- szklana butelka
- kartka

##### Wstęp
Do pustego i Salomon nie naleje. Do pełnego tym bardziej.

##### Instrukcja
1. Zrób małą kulkę z kawałka papieru
2. Połóż butelkę (szklaną!) na poziomej powierzchni
3. Połóż kulkę na szyjce od butelki, a następnie wdmuchaj ją do środka
4. Obserwuj, co się dzieje

##### Wyjaśnienie
Butelka wbrew pozorom nie jest pusta tylko napełniona powietrzem. Kiedy dmuchamy próbujemy wtłoczyć do niej jeszcze więcej powietrza. Tak samo jak do butelki pełnej wody nie możemy wlać więcej płynów tak do butelki pełnej powietrza nie można wtłoczyć więcej gazu. Gaz wychodząc z butelki zabiera ze sobą kulkę.
  '),
     ('Wklęsły balon',CURRENT_TIMESTAMP,
  '
  ### Wklęsły balon

##### Rzeczy
- balon
- butelka
- woda
- nożyczki

##### Wstęp
Tym razem eksperyment zagadka – jak bez użycia płuc nadmuchać balona?

##### Instrukcja
1. Nalej wody do ¾ pojemności butelki
2. Nałóż balon na otwór butelki
3. Przebij butelkę jak najbliżej dna (uwaga! – będzie mokro!)
4. Obserwuj, co się dzieje

##### Wyjaśnienie
Kiedy woda opuszcza butelkę pojawia się w niej dużo wolnego miejsca, które dość szybko zostaje zapełnione przez powietrze. Choć stałoby się to również bez obecności balona, dzięki niemu możemy zobaczyć to na własne oczy.
  '),
     ('Wyrzutnia kulek',CURRENT_TIMESTAMP,
  '
  ### Wyrzutnia kulek

#### Rzeczy
- butelka
- balon
- nożyczki
- papier

#### Wstęp
Robisz „pyk” i strzela

#### Instrukcja
1. Odetnij dno oraz górną część butelki, tak aby powstała otwarta z dwóch stron rura
2. Rozetnij balon na pół, a jego górną część (tę bez ogonka) naciągnij na jeden z otworów rury, która właśnie stała się wyrzutnią
3. Zrób kulkę z papieru i wrzuć ją do środka wyrzutni
4. Naciągnij balon delikatnie, bądź trochę mocniej uważając jednak, aby nie spadł z butelki!
5. Puść naciągnięty balon
6. Obserwuj, co się dzieje, ćwicz celność i sprawdzaj amunicję

#### Wyjaśnienie
Bezcelowe strzelanie może się w końcu znudzić. Nic nie stoi jednak na przeszkodzie, aby lekko je urozmaicić. Można przecież strącać przedmioty, bić rekordy odległości, widowiskowo rozsypać konfetti, czy co tam innego wpadnie do Twej głowy.

Nasza wyrzutnia raczej nikomu nie zaszkodzi. Ludzkość nie była jednak równie delikatna przy konstruowaniu kolejnych broni. Ich rozwój wpływał nie tylko na sposoby uśmiercania, ale niósł ze sobą wiele przemian społecznych. Inaczej wygląda walka oraz konstruowanie wojska opierającego się na piechurach, a inaczej używającego dronów i broni biologicznych. Inaczej wygląda również polityka kiedy zasięg zabijania wyznacza naostrzony kijek, a inaczej gdy za pomocą jednego przycisku można zdecydować o zagładzie całego państwa.
  '),
     ('Wyrzutnia powietrza',CURRENT_TIMESTAMP,
  '
  ### Wyrzutnia powietrza

##### Rzeczy
- butelka
- balon
- nożyczki

##### Wstęp
Podmuch powietrza może działać destrukcyjnie, bądź wspomagać działanie człowieka. To od niego oraz od nas samych zależy jak się stanie.

##### Instrukcja
1. Odetnij dno od butelki
2. Rozetnij balon na pół, a jego górną część (tę bez ogonka) naciągnij na dziurę, która powstała w butelce po odcięciu dna
3. Naciągaj balon delikatnie, bądź trochę mocniej uważając jednak, aby nie spadł z butelki!
4. Podczas naciągania zbliż dłoń do otworu butelki i powoli oddalaj
5. Obserwuj, co się dzieje i sprawdź odległość na jaką działa uzyskany efekt, oraz jego możliwości (np. przemieszczania przedmiotów, bądź gaszenia świeczek)

##### Wyjaśnienie
Wiatr, to nic innego jak powietrze wprawione w ruch. Uderzając, bądź ciągnąc za balon poruszamy cząsteczki powietrza, a dzięki stosunkowo małemu wylotowi butelki możemy skierować je w konkretne miejsce.
  '),
     ('Wyrzutnia rakiet',CURRENT_TIMESTAMP,
  '
  ### Wyrzutnia rakiet


#### Rzeczy
- butelka
- kartka
- nożyczki

#### Wstęp
Skonstruuj własną wyrzutnię rakiet

#### Instrukcja
1. Wytnij z kartki kwadrat o wymiarach zbliżonych do 5 cm x 5 cm
2. Wycięty kwadrat skręć w rulon i umieść w otworze butelki, tak aby część wystawała, a część była w środku. To będzie nasza wyrzutnia
3. Wytnij z kartki prostokąt o wymiarach zbliżonych do 7 cm x 12 cm
4. Wycięty prostokąt skręć w rulon, a u jego góry zrób zamknięty dziubek. Postaraj się, aby zrolowana kartka była jak najszczelniej skręcona i nie przepuszczała powietrza zarówno u góry, jak i po bokach. Zwróć uwagę na to, aby szerokość dolnego otworu była jedynie nieznacznie większa od szerokości kartki tkwiącej w butelce. To będzie nasza rakieta
5. Nałóż rakietę na wyrzutnię
6. Energicznym i szybkim ruchem naciśnij jak najmocniej na butelkę
7. Obserwuj, co się dzieje
8. Eksperymentuj z rozmiarami, kształtem i typem pocisku

#### Wyjaśnienie
Gdy naciskamy na butelkę powietrze w środku próbuje wydostać się na zewnątrz. Na drodze ku wolności znajduje się  jednak rakieta. Powietrze wychodząc z butelki wystrzeliwuje przy okazji nasz pocisk. Im mocniejszy będzie nacisk tym szybciej i dalej rakieta poleci. Niezmiernie istotne jest, aby ściany pocisku przepuszczały jak najmniej powietrza – jeżeli przepuszczą go zbyt dużo siła nie będzie wystarczająca do wystrzału, a uciekające powietrze rozejdzie się na boki.
  ')
  ;

CREATE TABLE trial_product (
    trial_id int,
    product_id int,
  FOREIGN KEY (trial_id) REFERENCES trial(id),
  FOREIGN KEY (product_id) REFERENCES product(id)
);

INSERT INTO trial_product (trial_id, product_id) VALUES
(1, 1),
(2, 2),
(2, 1),
(3, 1),
(3, 2),
(4, 2),
(4, 2),
(4, 2),
(4, 2),
(4, 5),
(5, 1),
(5, 1),
(6, 2),
(7, 4),
(8, 4),
(8, 3),
(9, 2),
(9, 3),
(9, 5),
(10, 2),
(10, 3),
(10, 5),
(11, 1),
(11, 2),
(11, 3),
(12, 1),
(12, 1),
(12, 2),
(12, 3),
(13, 4),
(14, 1),
(14, 4),
(15, 2),
(15, 1),
(15, 5),
(16, 5),
(16, 4),
(16, 2),
(17, 2),
(17, 3),
(17, 5),
(18, 1),
(18, 5),
(19, 2),
(19, 5),
(20, 3),
(20, 1),
(21, 2),
(21, 5),
(22, 2),
(22, 2),
(22, 5),
(23, 2),
(23, 4),
(23, 3),
(24, 2),
(24, 4),
(24, 5),
(25, 2),
(25, 4),
(25, 5),
(26, 4),
(26, 4),
(27, 4),
(27, 2),
(28, 2),
(28, 1),
(28, 3),
(28, 5),
(29, 2),
(29, 1),
(29, 4),
(29, 3),
(30, 2),
(30, 1),
(30, 3),
(31, 2),
(31, 4),
(31, 3);

