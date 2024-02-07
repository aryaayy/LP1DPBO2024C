#include <bits/stdc++.h>
#include "Anggota.cpp"

#define pb push_back
#define nl '\n'

using namespace std;

int main(){
    int i;
    vector<Anggota> vec;
    string input;
    do{
        cin >> input;
        if(input != "END"){
            Anggota temp;
            int id;
            string search, nama, bidang, partai;
            if(input == "ADD"){
                cin >> id >> nama >> bidang >> partai;

                temp.setId(id);
                temp.setName(nama);
                temp.setBidang(bidang);
                temp.setPartai(partai);

                vec.pb(temp);
            }
            else if(input == "DEL"){
                cin >> search;
                i = 0;
                bool found = false;
                while(i < vec.size() && !found){
                    if(vec[i].getName() == search){
                        vec.erase(vec.begin()+i);
                        found = true;
                    }
                    i++;
                }
            }
            else if(input == "UPDATE"){
                cin >> search;
                i = 0;
                bool found = false;
                while(i < vec.size() && !found){
                    if(vec[i].getName() == search){
                        cin >> id >> nama >> bidang >> partai;

                        vec[i].setId(id);
                        vec[i].setName(nama);
                        vec[i].setBidang(bidang);
                        vec[i].setPartai(partai);

                        found = true;
                    }
                    else{
                        i++;
                    }
                }
            }
            else if(input == "SHOW"){
                i = 0;
                for(auto it = vec.begin(); it != vec.end(); it++){
                    cout << i+1 << ". " << it->getId() << " | " << it->getName() << " | " << it->getBidang() << " | " << it->getPartai() << nl;
                    i++;
                }
            }
            else{
                cout << "COMMAND NOT RECOGNIZED" << nl;
            }

            cout << nl;
        }
    }while(input != "END");

    return 0;
}