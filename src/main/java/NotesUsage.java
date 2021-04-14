import model.Category;
import model.Note;
import model.User;
import model.enums.CategoryName;

import java.util.Date;
import java.util.List;

public class NotesUsage {
    public static void main(String[] args){
        System.out.println("=== Homework1 ===");
        homework1Usage();

        System.out.println();
        System.out.println("=== Homework2 ===");
        homework2Usage();
    }

    private static void homework1Usage(){
        User user = new User("Albert", "Einstein", "alik@gmail.com");
        Note note = new Note("Read it!", "This paragraph was a waste of time and space. If you had not read this and I had not typed this you and I could've done something more productive than reading this mindlessly and carelessly as if you did not have anything else to do in life. Life is so precious because it is short and you are being so careless that you do not realize it until now since this void paragraph mentions that you are doing something so mindless, so stupid, so careless that you realize that you are not using your time wisely. You could've been playing with your dog, or eating your cat, but no. You want to read this barren paragraph and expect something marvelous and terrific at the end. But since you still do not realize that you are wasting precious time, you still continue to read the null paragraph. If you had not noticed, you have wasted an estimated time of 20 seconds. Imagine what you could've done with those 20 seconds besides reading this non-productive paragraph. Imagine the things you could've accomplished. Imagine the possibilities. But time is irreversible and you still do not realize this. Somehow you have managed still to waste around now 35 seconds reading this stupid, excessive, and long paragraph with your irreversible time. If you haven't realized that, then you have not yet read the whole paragraph. Even if you did, you still refuse to stop reading this essay. After around 45 seconds, you are still reading this mindlessly and carelessly with your precious and non-reversible time. If you remembered from the first sentence of this disgustingly long paragraph, you would remember that this paragraph was a waste of time and space, imagine if I had not typed this paragraph and you had not read it. Imagine all the things you could've done, the things that made you, you. But no, you are still reading this paragraph and it has been around 60 seconds, which is a whole full minute. A minute! Yet you still have the urge and motivation to read this pointless and long essay. Now you have nearly reached the end, you ponder, why am I reading this? Why is the writer making a paragraph so long that I have the urge and motivation to finish this pointless paragraph to prove him that reading is what makes me, me. Then you realize, you have wasted now around a minute and 10 seconds. If you had not make the idiotic decision of continuing to read this paragraph, use that mind of yours to think what you could've done throughout your whole irreversible time. You could've finished your homework, play with your cat, eat your seal, or you could've discovered who made the fire hydrant, if you did not get the reference, you could've went and learned something and post it on reddit in the subreddit Today I learned, but you still have the urge to read this insanely long paragraph, pondering how I typed this without rest. Then you read this text and see that text over there. Why am I still reading this? How does this paragraph know what I'm thinking? What did I eat last April the 17th? Then you come to the conclusion that you know that this useless and insanely long paragraph would tell you. And you are right, but I did not write this and you have wasted now around 2 minutes. A full 2 minutes. Now, use that intelligence that you have, assuming that your IQ is above 60 and you are literate. Now that you have made it this far, you wonder if you learned anything, but no, you did not get the reference about the fire hydrant and refused to look it up, then you make the decision of reading this long essay with your irreversible time. Since you have made it this far on your long journey, you try have the urge to stop reading. But I bet you cannot finish this paragraph for which you are lazy and want to continue on with your life, but you keep on reading this long, wasteful, barren, and non-productive essay that will not benefit you in any way than making you lose your irreversible and precious time, but that is not even a benefit. Soon you realize that it has been now 3 minutes. A full 3 minutes, now you use your intelligence with an IQ above 70 and ponder about the things you could've done, the assignments you could've done, the dogs and cats you could've eaten. But you continue reading this now nearly 2 paged paragraph. Then you wonder how this is even a paragraph. How am did I make it this far? Do I get a certificate? Why am I reading this pointless and barren paragraph? How does this essay know what I'm thinking about? Then finally, you feel relaxed and accomplished because the essay said finally to make you hyped up that you accomplished reading a nearly 2 paged essay then the paragraph creates a plot twist; You're no where near the ending. Your insides wince a little while you're reading this endless paragraph. Wondering if this will ever end. Then you start getting nervous that it's almost time for bed, then you wonder what you ate for breakfast on June the 9th. How does this paragraph know what you're thinking about you think? Because when you're reading a paragraph inside your head, the words are projected into your brain with the IQ above 90 and then the thought process go through your internal organs and through yours eyes and you wonder if this is actually true but it's really not because all it is non-sense. Then you look at your watch, if you had one, and realize that it's been a near 4 minutes. 4 minutes, if you expect this paragraph to say the old and customary saying after you've discovered how long it's been, then you're wrong. This time, the paragraph is going to criticize you why you're still reading this essay with your irreversible and precious time. Why are you still reading this you ask? Because you are so headstrong and careless, yet you have the urge and motivation to continue reading this essay that it feels like an eternity. If you have made it this far, then it is mind boggling on what you could've done with your near 5 minutes. Imagine the things you could've eaten ; sushi, sharks, dogs, snakes, cats, fish, humans, dogs, dogs, and many more wonders of this world. Then when you are reading this, you realize that there is no long a wall of text, you realize that you think you've made it to the ending and I congratulate you on your epic journey across the wall of text. Yet you have not yet realized, that you wasted a full 5 minutes on this paragraph that feels endless yet it has been ceased.", new Date(), user);
        Category category = new Category("#Thoughts", 1);

        System.out.println(user.getUserFirstName() + " " + user.getUserLastName() + " " + user.getEmailAddress());
        System.out.println();
        System.out.println(note.getNoteHeader().toUpperCase());
        System.out.println(note.getNoteBody());
        System.out.println();
        System.out.println("Created by " + note.getNoteCreator().getUserFirstName() + " " + note.getNoteCreator().getUserLastName() + " at " + note.getNoteDate());
        System.out.println(category.getCatName());
    }

    private static void homework2Usage(){
        NoteStorage noteStorage = new NoteStorage();

        User user0 = new User("Sigmund", "Freud", "lil_sigi@gmail.com");
        User user1 = new User("Carl Gustav", "Jung", "carlooo@gmail.com");

        noteStorage.addNote(new Note("Ego", "Where id was, there ego shall be.", new Date(), user0));
        noteStorage.addNote(new Note("Kids", "Children are completely egoistic; they feel their needs intensely and strive ruthlessly to satisfy them.", new Date(), user0, CategoryName.DIARY));
        noteStorage.addNote(new Note("The Interpretation of Dreams", "In the following pages, I shall demonstrate that there exists a psychological technique by which dreams may be interpreted and that upon the application of this method every dream will show itself to be a senseful psychological structure which may be introduced into an assignable place in the psychic activity of the waking state. I shall furthermore endeavor to explain the processes which give rise to the strangeness and obscurity of the dream, and to discover through them the psychic forces, which operate whether in combination or opposition, to produce the dream. This accomplished by investigation will terminate as it will reach the point where the problem of the dream meets broader problems, the solution of which must be attempted through other material", new Date(), user0, CategoryName.WORK));

        noteStorage.addNote(new Note("Chemistry", "The meeting of two personalities is like the contact of two chemical substances: if there is any reaction, both are transformed", new Date(), user1, CategoryName.THOUGHTS));
        noteStorage.addNote(new Note("Me", "I am not what happened to me, I am what I choose to become.", new Date(), user1, CategoryName.DIARY));

        List<Note> notes = noteStorage.getAllNotes();

        for (int i = 0; i < notes.size(); i++){
            System.out.println();
            System.out.println(notes.get(i).getNoteHeader());
            System.out.println(notes.get(i).getNoteBody());
            System.out.println("Created by " + notes.get(i).getNoteCreator().getUserFirstName() + " " + notes.get(i).getNoteCreator().getUserLastName());
            System.out.println(notes.get(i).getNoteDate());
            System.out.println(notes.get(i).getNoteCategory());
        }

        List<Note> user1Notes = noteStorage.getUserNotes(user1.getUserId());
        System.out.println();
        System.out.println("--- Notes for one user ---");
        for (int i = 0; i < user1Notes.size(); i++) {
            System.out.println();
            System.out.println(user1Notes.get(i).getNoteHeader());
            System.out.println(user1Notes.get(i).getNoteBody());
            System.out.println("Created by " + user1Notes.get(i).getNoteCreator().getUserFirstName() + " " + user1Notes.get(i).getNoteCreator().getUserLastName());
            System.out.println(user1Notes.get(i).getNoteDate());
        }






    }
}
