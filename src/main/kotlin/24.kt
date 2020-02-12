fun main(){
    var count = 0
    for(a in 0..9){
        for(b in 0..9){
            if(b==a) continue
            for(c in 0..9){
                if(b==c || a == c) continue
                for(d in 0..9){
                    if(c==d || d==b || d==a) continue
                    for(e in 0..9){
                        if(e==a||e==b||e==c||e==d) continue
                        for(f in 0..9){
                            if(f==a||f==b||f==c||f==d||f==e) continue
                            for(g in 0..9){
                                if(g==a||g==b||g==c||g==d||g==e||g==f) continue
                                for(h in 0..9){
                                    if(h==a||h==b||h==c||h==d||h==e||h==f||h==g) continue
                                    for(i in 0..9){
                                        if(i==a||i==b||i==c||i==d||i==e||i==f||i==g||i==h) continue
                                        for(j in 0..9){
                                            if(j==a||j==b||j==c||j==d||j==e||j==f||j==g||j==h||j==i) continue
                                            count ++
                                            if(count == 999999 || count == 1000001 || count == 1000000)
                                                println("${count}: $a$b$c$d$e$f$g$h$i$j")
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}