#semnul egal = atribuie/copiaza o valoare de la drepta la stanga indiferent de ce introduce userul
#Ask user for their name
name = input("What's your name? ").strip().title()

#Remove white space from String
#sau: name = name.strip().title()

#Split user's name into first name and last name
first, last = name.split(" ")

#Say hello to user
print(f"hello, {first}" ) #f to format String
#varibila = container pentru o valaore
