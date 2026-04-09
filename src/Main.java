void main() {
    Actor firstActor = new Actor(150, "Владос", "Низкий", "Male");
    Actor secondActor = new Actor(250, "Владос", "Шпалов", "Male");
    Actor thirdActor = new Actor(160, "Аня", "Актерша", "Female");
    Choreographer choreographer = new Choreographer("Важный", "Непростой", "Хореографер");
    Director firstDirector = new Director(100, "1", "12", "Male");
    Director secondDirector = new Director(101, "2", "22", "Male");


    Show show = new Show("три рыбки", 1000, firstDirector);
    Opera opera = new Opera(100000, "реп", "ААААОООООООАОАОАОАОАО", "тараканьи бега", 100, firstDirector);
    Ballet ballet = new Ballet(choreographer,"Лепешка", "БУЛЬБУЛЬБУЛЬ", "щучий заплыв",1000, secondDirector);
    show.addActor(firstActor);
    show.addActor(secondActor);
    show.addActor(thirdActor);
    opera.addActor(firstActor);
    ballet.addActor(secondActor);
    ballet.addActor(thirdActor);
    show.printActors();
    opera.printActors();
    ballet.printActors();
    opera.replaceActor(firstActor, secondActor);
    opera.replaceActor(thirdActor, firstActor);
    opera.printLibretto();
    ballet.printLibretto();
}
