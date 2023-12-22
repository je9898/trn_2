package Package06;

class interfaces {
    interface NoNoOver {
        //오버로딩 반복하기 싫어 만든 인터페이스
        String setName();   // 인터페이스 쓸놈들 이 메소드 무조건 써라
        /*void bark();*/
    }

    interface BarkBark {
        String setBark();
    }

    class Animal{
        String name;
        String bark;

    }

    class Tiger extends Animal implements NoNoOver, BarkBark{
        public String setName(){
            this.name = "어흥이";
            return this.name;
        }

        public String setBark(){
            this.bark = "어흥어흥";
            return this.bark;
        }
    }

    class Lion extends Animal implements NoNoOver, BarkBark{
        public String setName(){
            this.name = "냐옹이";
            return this.name;   //상속받은 전역 name
        }

        public String setBark(){
            this.bark = "냐옹냐옹";
            return this.bark;
        }
    }

    class ZooKeeper{
        void feed(NoNoOver nonoover) {
            System.out.println("Name : " + nonoover.setName());
        }

        void feed(BarkBark barkbark){
            System.out.println(/*this.name + "는 " +*/ barkbark.setBark());
        }
    }

    /*class Bouncer {
        void barkAnimal(Animal animal) {
            if (animal instanceof Tiger) {
                System.out.println("어흥");
            } else if (animal instanceof Lion) {
                System.out.println("냥냥");
            }
        }
    }*/
}
