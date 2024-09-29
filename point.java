public class point{
 private String nom;
 private int abscisse;
private int ordonnee;
public point(String n,int a, int o){
abscisse=a;
ordonnee=o;
nom=n;}
public point(String n){
nom=n;}
public point(int a,int o){
abscisse=a;
ordonnee=o;}
void Affiche(){
System.out.println(nom + "(" + abscisse + ";" + ordonnee + ")");
}
void TranslHoriz (int a){
abscisse=abscisse+a;

}
void TranslVert (int a){
ordonnee=ordonnee+a;
}
void Translation (int a, int b){
ordonnee=ordonnee+a;
abscisse=abscisse+b;
}
public boolean Coincide (point p){
return (this.abscisse==p.abscisse&&this.ordonnee==p.ordonnee);}
public String getNom(){
return this.nom;}
public int getAbscisse(){
return this.abscisse;}
public int getOrdonnées(){
return this.ordonnee;}
public void setNom(String ch){
 this.nom = ch;}
public void setAbscisse(int a) {
         this.abscisse =a;
    }
void setOrdonnée(int a){
 this.ordonnee =a;
}}