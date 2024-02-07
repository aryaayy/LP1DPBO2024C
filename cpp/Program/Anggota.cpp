#include <iostream>
#include <string>

using namespace std;

class Anggota{
    private:
        int id;
        string name;
        string bidang;
        string partai;

    public:
        Anggota(){
            this->name = "";
            this->bidang = '-';
        }
        
        Anggota(int id, string name, string bidang, string partai){
            this->id = id;
            this->name = name;
            this->bidang = bidang;
            this->partai = partai;
        }

        int getId(){
            return this->id;
        }

        void setId(int id){
            this->id = id;
        }

        string getName(){
            return this->name;
        }

        void setName(string name){
            this->name = name;
        }

        string getBidang(){
            return this->bidang;
        }

        void setBidang(string bidang){
            this->bidang = bidang;
        }

        string getPartai(){
            return this->partai;
        }

        void setPartai(string partai){
            this->partai = partai;
        }

        ~Anggota(){

        }
};