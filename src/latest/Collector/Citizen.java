package latest.Collector;

public class Citizen {
        private int id;
        private String name;

        public Citizen(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Employee{id=" + id + ", name='" + name + '\'' + '}';
        }

}
