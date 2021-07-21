package peaksoft.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

 @Component
    public class Animal {

        @Autowired
        private Cat cat;

        @Autowired
        private Dog dog;


        public Cat getCat() {
            return cat;
        }

        public void setCat(Cat cat) {
            this.cat = cat;
        }

        public Dog getDog() {
            return dog;
        }

        public void setDog(Dog dog) {
            this.dog = dog;
        }
 }