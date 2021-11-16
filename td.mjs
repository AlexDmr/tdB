const parser = new DOMParser();
async function getXML(r) {
    const str = await (await fetch("./listeActeurs.xml")).text();
    return parser.parseFromString(str, "text/xml");
}

const doc = await getXML("./listeActeurs.xml");
console.log(doc);
