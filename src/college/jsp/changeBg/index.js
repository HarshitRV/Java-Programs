console.log("script-loaded");

const changeBg = () => {
    let color = f1.colors.value;
    f1.action = `setBg.jsp?col=${color}`;  // submit form to this page
    f1.submit();
}

// changeBg();