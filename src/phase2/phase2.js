/**
 * phase 2
 */


const name = ['E','L','E','N','A','1'];
const vocal = 'aeiouAEIOU';
const num = '0123456789';

for (let i = 0; i < name.length; i++) {
	if(vocal.indexOf(name[i]) != -1){
		console.log("VOCAL");
	} else if(num.indexOf(name[i]) != -1){
		console.log("Els noms de persones no contenen números!");
	} else{
		console.log("CONSONTANT");
	}
}