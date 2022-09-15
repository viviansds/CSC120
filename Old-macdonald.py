def oldMacDonald(animal:str,sound:str):
    print("Old MacDonald had a farm, EIEIO")
    print("And on that farm, he had a", animal, "EIEIO")
    print("With a", sound,sound, "here")
    print("and a", sound,sound, "there")
    print("Here a", sound, "there a", sound)
    print("everywhere a", sound, sound)
    print("Old MacDonald had a farm, EIEIO")

def main():
    animal: str = input("Enter an animal: ")
    sound: str = input("what sound does that animal make?")
    oldMacDonald(animal, sound)

main()

#oldMacDonald("pig","oink")
#oldMacDonald("horse","neigh")